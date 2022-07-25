package ai.sensorycloud.service;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

import ai.sensorycloud.SDKInitConfig;
import ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest;
import ai.sensorycloud.Config;
import ai.sensorycloud.tokenManager.SecureCredentialStore;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import ai.sensorycloud.api.common.GenericClient;
import ai.sensorycloud.api.common.TokenResponse;
import ai.sensorycloud.api.oauth.OauthServiceGrpc;
import ai.sensorycloud.api.oauth.TokenRequest;
import ai.sensorycloud.api.oauth.WhoAmIRequest;
import ai.sensorycloud.api.oauth.WhoAmIResponse;
import ai.sensorycloud.api.v1.management.DeviceResponse;
import ai.sensorycloud.api.v1.management.DeviceServiceGrpc;
import ai.sensorycloud.api.v1.management.EnrollDeviceRequest;

/**
 * A collection of grpc calls for enrolling and requesting OAuth tokens
 */
public class OAuthService {

    /**
     * Wrapper struct for OAuth client credentials
     */
    public static class OAuthClient {
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

    private SecureCredentialStore secureCredentialStore;
    private ManagedChannel unitTestingManagedChannel;
    private final char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    /**
     * @return The underlying SecureCredentialStore being used
     */
    public SecureCredentialStore getSecureCredentialStore() {
        return secureCredentialStore;
    }

    /**
     * Creates a new OAuthService instance
     *
     * @param secureCredentialStore A secure credential store to fetch OAuth credentials from
     */
    public OAuthService(SecureCredentialStore secureCredentialStore) {
        this.secureCredentialStore = secureCredentialStore;
        this.unitTestingManagedChannel = null;
    }

    /**
     * Creates a new OAuthService instance
     *
     * @param secureCredentialStore A secure credential store to fetch OAuth credentials from
     * @param managedChannel A grpc managed channel to use for grpc calls, this is primarily used to assist with unit testing
     */
    public OAuthService(SecureCredentialStore secureCredentialStore, ManagedChannel managedChannel) {
        this.secureCredentialStore = secureCredentialStore;
        this.unitTestingManagedChannel = managedChannel;
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
        ManagedChannel managedChannel = getManagedChannel();
        try {
            OauthServiceGrpc.OauthServiceBlockingStub client = OauthServiceGrpc.newBlockingStub(managedChannel);

            TokenRequest tokenRequest = TokenRequest.newBuilder()
                    .setClientId(secureCredentialStore.getClientId().orElseThrow(() -> new Exception("ClientID could not be found in secure storage")))
                    .setSecret(secureCredentialStore.getClientSecret().orElseThrow(() -> new Exception("Client secret could not be found in secure storage")))
                    .build();

            TokenResponse token = client.getToken(tokenRequest);
            return token;
        } catch (Exception ex) {
            throw ex;
        } finally {
            managedChannel.shutdown();
        }
    }

    /**
     * Requests a new OAuth token from the server
     *
     * @param listener Listener that the results will be passed back to
     */
    public void getToken(GetTokenListener listener) {
        ManagedChannel managedChannel = getManagedChannel();
        OauthServiceGrpc.OauthServiceStub client = OauthServiceGrpc.newStub(managedChannel);

        String clientID, clientSecret;
        try {
            clientID = secureCredentialStore.getClientId().orElseThrow(() -> new Exception("ClientID could not be found in secure storage"));
            clientSecret = secureCredentialStore.getClientSecret().orElseThrow(() -> new Exception("Client secret could not be found in secure storage"));
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
     * @param credential Credential string to authenticate that this device is allowed to enroll
     * @param clientID ClientID to use for OAuth token generation
     * @param clientSecret Client secret to use for OAuth token generation
     * @param listener Listener that the results will be passed back to
     */
    public void register(
            String deviceName,
            String credential,
            String clientID,
            String clientSecret,
            EnrollDeviceListener listener ) {
        ManagedChannel managedChannel = getManagedChannel();
        SDKInitConfig config = Config.getSharedConfig();
        DeviceServiceGrpc.DeviceServiceStub deviceServiceStub = DeviceServiceGrpc.newStub(managedChannel);

        GenericClient genericClient = GenericClient.newBuilder()
                .setClientId(clientID)
                .setSecret(clientSecret)
                .build();
        EnrollDeviceRequest enrollDeviceRequest = EnrollDeviceRequest.newBuilder()
                .setName(deviceName)
                .setDeviceId(config.deviceID)
                .setTenantId(config.tenantID)
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
        ManagedChannel managedChannel = getManagedChannel();

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

    /**
     * Renews the credentials stored in the attached SecureCredentialStore. This should be called once the device key has expired.
     *
     * @param credential The credential configured on the Sensory Cloud Server
     * @param listener Listener that the results will be passed back to
     */
    public void renewDeviceCredential(String credential, EnrollDeviceListener listener) {
        ManagedChannel managedChannel = getManagedChannel();
        SDKInitConfig config = Config.getSharedConfig();
        DeviceServiceGrpc.DeviceServiceStub deviceServiceStub = DeviceServiceGrpc.newStub(managedChannel);

        String clientId;
        try {
            clientId = secureCredentialStore.getClientId().orElseThrow(() -> new Exception("ClientID could not be found in secure storage"));
        } catch (Exception e) {
            listener.onFailure(e);
            return;
        }

        RenewDeviceCredentialRequest request = RenewDeviceCredentialRequest.newBuilder()
                .setDeviceId(config.deviceID)
                .setClientId(clientId)
                .setTenantId(config.tenantID)
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

        deviceServiceStub.renewDeviceCredential(request, responseObserver);
    }

    private String secRandomString(int length) {
        Random random = new SecureRandom();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append(chars[random.nextInt(chars.length)]);
        }

        return builder.toString();
    }

    private ManagedChannel getManagedChannel() {
        ManagedChannel managedChannel = unitTestingManagedChannel;
        if (managedChannel == null) {
            SDKInitConfig config = Config.getSharedConfig();
            if (config.isSecure) {
                managedChannel = ManagedChannelBuilder.forTarget(config.fullyQualifiedDomainName).useTransportSecurity().build();
            } else {
                managedChannel = ManagedChannelBuilder.forTarget(config.fullyQualifiedDomainName).usePlaintext().build();
            }
        }
        return managedChannel;
    }
}
