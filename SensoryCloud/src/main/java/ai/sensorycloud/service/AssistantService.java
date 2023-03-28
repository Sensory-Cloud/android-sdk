package ai.sensorycloud.service;

import ai.sensorycloud.Config;
import ai.sensorycloud.SDKInitConfig;
import ai.sensorycloud.api.v1.assistant.AssistantServiceGrpc;
import ai.sensorycloud.api.v1.assistant.ChatMessage;
import ai.sensorycloud.api.v1.assistant.TextChatRequest;
import ai.sensorycloud.api.v1.assistant.TextChatResponse;
import ai.sensorycloud.tokenManager.TokenManager;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class AssistantService {

    public interface TextChatListener {
        void onSuccess(TextChatResponse response);
        void onFailure(Throwable t);
    }

    private TokenManager tokenManager;
    private ManagedChannel unitTestingManagedChannel;

    public AssistantService(TokenManager tokenManager) { this.tokenManager = tokenManager; }

    public AssistantService(TokenManager tokenManager, ManagedChannel managedChannel) {
        this.tokenManager = tokenManager;
        this.unitTestingManagedChannel = managedChannel;
    }

    public void textChat(String modelName, Iterable<ChatMessage> messages, TextChatListener listener) {
        ManagedClient client;
        try {
            client = getManagedClient();
        } catch (Exception e) {
            listener.onFailure(e);
            return;
        }

        TextChatRequest request = TextChatRequest.newBuilder()
                .setModelName(modelName)
                .addAllMessages(messages)
                .build();

        StreamObserver<TextChatResponse> responseObserver = new StreamObserver<TextChatResponse>() {
            @Override
            public void onNext(TextChatResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                client.managedChannel.shutdown();
            }
        };
        client.client.textChat(request, responseObserver);
    }

    private class ManagedClient {
        ManagedChannel managedChannel;
        AssistantServiceGrpc.AssistantServiceStub client;

        ManagedClient(ManagedChannel managedChannel, AssistantServiceGrpc.AssistantServiceStub client) {
            this.managedChannel = managedChannel;
            this.client = client;
        }
    }

    private ManagedClient getManagedClient() throws Exception {
    ManagedChannel managedChannel = unitTestingManagedChannel;
    if (managedChannel == null) {
        SDKInitConfig config = Config.getSharedConfig();
        if (config.isSecure) {
            managedChannel = ManagedChannelBuilder.forTarget(config.fullyQualifiedDomainName).useTransportSecurity().build();
        } else {
            managedChannel = ManagedChannelBuilder.forTarget(config.fullyQualifiedDomainName).usePlaintext().build();
        }
    }
    ClientInterceptor header = tokenManager.getAuthorizationMetadata();
    AssistantServiceGrpc.AssistantServiceStub assistantClient = AssistantServiceGrpc.newStub(managedChannel);
    assistantClient = assistantClient.withInterceptors(header);

    return new ManagedClient(managedChannel, assistantClient);
    }
}
