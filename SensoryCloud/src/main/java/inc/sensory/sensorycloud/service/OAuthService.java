package inc.sensory.sensorycloud.service;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

import inc.sensory.sensorycloud.config.Config;
import inc.sensory.sensorycloud.tokenManager.SecureCredentialStore;
import inc.sensory.sensorycloud.tokenManager.TokenManager;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import io.sensory.api.common.GenericClient;
import io.sensory.api.common.TokenResponse;
import io.sensory.api.oauth.OauthServiceGrpc;
import io.sensory.api.oauth.TokenRequest;
import io.sensory.api.oauth.WhoAmIRequest;
import io.sensory.api.oauth.WhoAmIResponse;
import io.sensory.api.v1.management.DeviceResponse;
import io.sensory.api.v1.management.DeviceServiceGrpc;
import io.sensory.api.v1.management.EnrollDeviceRequest;

/**
 * A collection of grpc calls for enrolling and requesting OAuth tokens
 */
public class OAuthService {

    /**
     * Wrapper struct for OAuth client credentials
     */
    public class OAuthClient {
        /**
         * OAuth client ID
         */
        public String clientId;
        /**
         * OAuth client secret
         */
        public String clientSecret;

        public OAuthClient(String clientId, String clientSecret) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }
    }

    /**
     * Listener class for the device enrollment grpc response
     */
    public interface EnrollDeviceListener {
        /**
         * Called once the device has been successfully enrolled
         * @param response The device enrollment response
         */
        void onSuccess(DeviceResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    /**
     * Listener class for OAuth token grpc responses
     */
    public interface GetTokenListener {
        /**
         * Called once a new OAuth token has been received from the server
         * @param response The OAuth token response
         */
        void onSuccess(TokenResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    /**
     * Listener class for WhoAmI grpc responses
     */
    public interface GetWhoAmIListener {
        /**
         * Called once the WhoAmI response is received
         * @param response the WhoAmI response
         */
        void onSuccess(WhoAmIResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    private Config config;
    private SecureCredentialStore secureCredentialStore;
    private final char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    /**
     * Creates a new OAuthService instance
     *
     * @param config SDK configuration to use
     * @param secureCredentialStore A secure credential store to fetch OAuth credentials from
     */
    public OAuthService(Config config, SecureCredentialStore secureCredentialStore) {
        this.config = config;
        this.secureCredentialStore = secureCredentialStore;
    }

    /**
     * Generates a cryptographically secure set of OAuth credentials
     *
     * @return a clientID and clientSecret that could be used for device enrollment
     */
    public OAuthClient generateCredentials() {
        String clientId = UUID.randomUUID().toString();
        String clientSecret = secRandomString(16);
        return new OAuthClient(clientId, clientSecret);
    }

    /**
     * Requests a new OAuth token from the server, blocking the current thread until a response is received
     *
     * @return The OAuth token response
     * @Throws Exception – on grpc error or Secure Credential Store error
     */
    public TokenResponse getTokenSync() throws Exception {
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();

        OauthServiceGrpc.OauthServiceBlockingStub client = OauthServiceGrpc.newBlockingStub(managedChannel);

        TokenRequest tokenRequest = TokenRequest.newBuilder()
                .setClientId(secureCredentialStore.getClientId())
                .setSecret(secureCredentialStore.getClientSecret())
                .build();

        return client.getToken(tokenRequest);
    }

    /**
     * Requests a new OAuth token from the server
     *
     * @param listener Listener that the results will be passed back to
     */
    public void getToken(GetTokenListener listener) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();

        OauthServiceGrpc.OauthServiceStub client = OauthServiceGrpc.newStub(managedChannel);

        String clientID, clientSecret;
        try {
            clientID = secureCredentialStore.getClientId();
            clientSecret = secureCredentialStore.getClientSecret();
        } catch (Exception e) {
            listener.onFailure(e);
            return;
        }

        TokenRequest tokenRequest = TokenRequest.newBuilder()
                .setClientId(clientID)
                .setSecret(clientSecret)
                .build();

        StreamObserver<TokenResponse> responseObserver = new StreamObserver<TokenResponse>() {
            @Override
            public void onNext(TokenResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                managedChannel.shutdown();
            }
        };

        client.getToken(tokenRequest, responseObserver);
    }

    /**
     * Creates a device enrollment for the current device
     * The credential string authenticates that this device is allowed to enroll. Depending on the server configuration the credential string may be one of multiple values:
     *  - An empty string if no authentication is configured on the server
     *  - A shared secret (password)
     *  - A signed JWT
     *
     * @param deviceName Name of the enrolling device
     * @param credential Credential string to authenticate that this device is alled to enroll
     * @param listener Listener that the results will be passed back to
     */
    public void register(
            String deviceName,
            String credential,
            EnrollDeviceListener listener ) {

        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();

        String clientID, clientSecret;
        try {
            clientID = secureCredentialStore.getClientId();
            clientSecret = secureCredentialStore.getClientSecret();
        } catch (Exception e) {
            listener.onFailure(e);
            return;
        }

        DeviceServiceGrpc.DeviceServiceStub deviceServiceStub = DeviceServiceGrpc.newStub(managedChannel);
        GenericClient genericClient = GenericClient.newBuilder()
                .setClientId(clientID)
                .setSecret(clientSecret)
                .build();
        EnrollDeviceRequest enrollDeviceRequest = EnrollDeviceRequest.newBuilder()
                .setName(deviceName)
                .setDeviceId(config.deviceConfig.deviceId)
                .setTenantId(config.tenantConfig.tenantId)
                .setClient(genericClient)
                .setCredential(credential)
                .build();

        StreamObserver<DeviceResponse> responseObserver = new StreamObserver<DeviceResponse>() {
            @Override
            public void onNext(DeviceResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                managedChannel.shutdown();
            }
        };

        deviceServiceStub.enrollDevice(enrollDeviceRequest, responseObserver);
    }

    /**
     * Gets information about the current registered device inferred from the credentials supplied by the credential store
     * A new token is requested every time this is called, so use sparingly
     *
     * @param listener Listener that the results will be passed back to
     */
    public void getWhoAmI(GetWhoAmIListener listener) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();

        StreamObserver<WhoAmIResponse> responseObserver = new StreamObserver<WhoAmIResponse>() {
            @Override
            public void onNext(WhoAmIResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                managedChannel.shutdown();
            }
        };

        getToken(new GetTokenListener() {
            @Override
            public void onSuccess(TokenResponse response) {
                Metadata header = new Metadata();
                Metadata.Key<String> key = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
                header.put(key, "Bearer " + response.getAccessToken());
                ClientInterceptor interceptor = MetadataUtils.newAttachHeadersInterceptor(header);

                OauthServiceGrpc.OauthServiceStub oauthServiceStub = OauthServiceGrpc.newStub(managedChannel);
                oauthServiceStub = oauthServiceStub.withInterceptors(interceptor);

                oauthServiceStub.getWhoAmI(WhoAmIRequest.getDefaultInstance(), responseObserver);
            }

            @Override
            public void onFailure(Throwable t) {
                listener.onFailure(t);
            }
        });
    }

    private String secRandomString(int length) {
        Random random = new SecureRandom();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append(chars[random.nextInt(chars.length)]);
        }

        return builder.toString();
    }
}
