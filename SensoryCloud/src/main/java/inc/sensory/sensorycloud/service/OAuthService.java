package inc.sensory.sensorycloud.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.sensory.api.common.GenericClient;
import io.sensory.api.common.TokenResponse;
import io.sensory.api.oauth.OauthServiceGrpc;
import io.sensory.api.oauth.TokenRequest;
import io.sensory.api.oauth.WhoAmIResponse;
import io.sensory.api.v1.management.DeviceResponse;
import io.sensory.api.v1.management.DeviceServiceGrpc;
import io.sensory.api.v1.management.EnrollDeviceRequest;

public class OAuthService {

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

    public void enrollDevice(
            String url, // TODO - config?
            String deviceID, // TODO - config?
            String tenantID, // TODO - config?
            String name,
            String credential,
            String clientID,
            String clientSecret,
            EnrollDeviceListener listener ) {

        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(url).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(url).usePlaintext().build();

        DeviceServiceGrpc.DeviceServiceStub deviceServiceStub = DeviceServiceGrpc.newStub(managedChannel);
        GenericClient genericClient = GenericClient.newBuilder()
                .setClientId(clientID)
                .setSecret(clientSecret)
                .build();
        EnrollDeviceRequest enrollDeviceRequest = EnrollDeviceRequest.newBuilder()
                .setName(name)
                .setDeviceId(deviceID)
                .setTenantId(tenantID)
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

    // TODO: - url config?
    public void getToken(String url, String clientID, String secret, GetTokenListener listener) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(url).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(url).usePlaintext().build();

        OauthServiceGrpc.OauthServiceStub client = OauthServiceGrpc.newStub(managedChannel);

        TokenRequest tokenRequest = TokenRequest.newBuilder()
                .setClientId(clientID)
                .setSecret(secret)
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

    // TODO - token manager
    public void getWhoAmI() {

    }
}
