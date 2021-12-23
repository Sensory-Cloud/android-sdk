package inc.sensory.sensorycloud.service;

import inc.sensory.sensorycloud.config.Config;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.sensory.api.common.ServerHealthResponse;
import io.sensory.api.health.HealthRequest;
import io.sensory.api.health.HealthServiceGrpc;

/**
 * A collection of grpc service calls for getting the health of the cloud host
 */
public class HealthService {

    /**
     * Listener class for the getHealth grpc responses
     */
    public interface GetHealthListener {
        /**
         * Called once the health status has been successfully retrieved
         * @param response The current health status of the server
         */
        void onSuccess(ServerHealthResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    private Config config;

    /**
     * Creates a new HealthService instance
     *
     * @param config SDK configuration to use
     */
    public HealthService(Config config) {
        this.config = config;
    }

    /**
     * Fetches the current health status of the cloud host
     *
     * @param listener Listener that results are passed back to
     */
    public void getHealth(GetHealthListener listener) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();

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

        client.getHealth(HealthRequest.getDefaultInstance(), responseObserver);
    }
}
