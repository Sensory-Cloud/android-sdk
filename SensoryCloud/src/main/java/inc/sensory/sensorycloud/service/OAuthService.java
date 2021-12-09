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

public class OAuthService {

    public class OAuthClient {
        public String clientId;
        public String clientSecret;

        public OAuthClient(String clientId, String clientSecret) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }
    }

    public interface EnrollDeviceListener {
        void onSuccess(DeviceResponse response);
        void onFailure(Throwable t);
    }

    public interface GetTokenListener {
        void onSuccess(TokenResponse response);
        void onFailure(Throwable t);
    }

    public interface GetWhoAmIListener {
        void onSuccess(WhoAmIResponse response);
        void onFailure(Throwable t);
    }

    private Config config;
    private SecureCredentialStore secureCredentialStore;
    private final char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    public OAuthService(Config config, SecureCredentialStore secureCredentialStore) {
        this.config = config;
        this.secureCredentialStore = secureCredentialStore;
    }

    public OAuthClient generateCredentials() {
        String clientId = UUID.randomUUID().toString();
        String clientSecret = secRandomString(16);
        return new OAuthClient(clientId, clientSecret);
    }

    public TokenResponse getTokenSync() {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        OauthServiceGrpc.OauthServiceBlockingStub client = OauthServiceGrpc.newBlockingStub(managedChannel);

        TokenRequest tokenRequest = TokenRequest.newBuilder()
                .setClientId(secureCredentialStore.getClientId())
                .setSecret(secureCredentialStore.getClientSecret())
                .build();

        return client.getToken(tokenRequest);
    }


    public void getToken(GetTokenListener listener) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        OauthServiceGrpc.OauthServiceStub client = OauthServiceGrpc.newStub(managedChannel);

        TokenRequest tokenRequest = TokenRequest.newBuilder()
                .setClientId(secureCredentialStore.getClientId())
                .setSecret(secureCredentialStore.getClientSecret())
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

    public void register(
            String deviceName,
            String credential,
            EnrollDeviceListener listener ) {

        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        DeviceServiceGrpc.DeviceServiceStub deviceServiceStub = DeviceServiceGrpc.newStub(managedChannel);
        GenericClient genericClient = GenericClient.newBuilder()
                .setClientId(secureCredentialStore.getClientId())
                .setSecret(secureCredentialStore.getClientSecret())
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

    public void getWhoAmI(GetWhoAmIListener listener) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

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
