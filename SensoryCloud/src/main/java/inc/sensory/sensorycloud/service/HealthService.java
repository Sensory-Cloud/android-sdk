package inc.sensory.sensorycloud.service;

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

    // TODO: - url config
    public void getHealth(String url, GetHealthListener listener) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(url).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(url).usePlaintext().build();

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
