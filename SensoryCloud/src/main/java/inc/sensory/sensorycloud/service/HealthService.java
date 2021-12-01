package inc.sensory.sensorycloud.service;

import inc.sensory.sensorycloud.config.Config;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.sensory.api.common.ServerHealthResponse;
import io.sensory.api.health.HealthRequest;
import io.sensory.api.health.HealthServiceGrpc;

public class HealthService {

    public interface GetHealthListener {
        void onSuccess(ServerHealthResponse response);
        void onFailure(Throwable t);
    }

    private Config config;

    public HealthService(Config config) {
        this.config = config;
    }

    public void getHealth(GetHealthListener listener) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        HealthServiceGrpc.HealthServiceStub client = HealthServiceGrpc.newStub(managedChannel);

        StreamObserver<ServerHealthResponse> responseObserver = new StreamObserver<ServerHealthResponse>() {
            @Override
            public void onNext(ServerHealthResponse value) {
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

        client.getHealth(HealthRequest.newBuilder().build(), responseObserver);
    }
}
