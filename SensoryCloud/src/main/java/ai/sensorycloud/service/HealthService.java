package ai.sensorycloud.service;

import ai.sensorycloud.Config;
import ai.sensorycloud.SDKInitConfig;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ai.sensorycloud.api.common.ServerHealthResponse;
import ai.sensorycloud.api.health.HealthRequest;
import ai.sensorycloud.api.health.HealthServiceGrpc;

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

    private ManagedChannel unitTestingManagedChannel;

    /**
     * Creates a new HealthService instance
     */
    public HealthService() {
    }

    /**
     * Creates a new HealthService instance
     *
     * @param managedChannel A grpc managed channel to use for grpc calls, this is primarily used to assist with unit testing
     */
    public HealthService(ManagedChannel managedChannel) {
        this.unitTestingManagedChannel = managedChannel;
    }

    /**
     * Fetches the current health status of the cloud host
     *
     * @param listener Listener that results are passed back to
     */
    public void getHealth(GetHealthListener listener) {
        ManagedChannel managedChannel = unitTestingManagedChannel;
        if (managedChannel == null) {
            SDKInitConfig config = Config.getSharedConfig();
            if (config.isSecure) {
                managedChannel = ManagedChannelBuilder.forTarget(config.fullyQualifiedDomainName).useTransportSecurity().build();
            } else {
                managedChannel = ManagedChannelBuilder.forTarget(config.fullyQualifiedDomainName).usePlaintext().build();
            }
        }
        HealthServiceGrpc.HealthServiceStub client = HealthServiceGrpc.newStub(managedChannel);

        ManagedChannel finalManagedChannel = managedChannel;
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
                finalManagedChannel.shutdown();
            }
        };

        client.getHealth(HealthRequest.getDefaultInstance(), responseObserver);
    }
}
