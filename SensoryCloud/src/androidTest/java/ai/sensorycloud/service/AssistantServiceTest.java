package ai.sensorycloud.service;

import junit.framework.TestCase;

import java.util.Arrays;

import ai.sensorycloud.SDKInitConfig;
import ai.sensorycloud.api.v1.assistant.AssistantServiceGrpc;
import ai.sensorycloud.api.v1.assistant.ChatMessage;
import ai.sensorycloud.api.v1.assistant.ChatRole;
import ai.sensorycloud.api.v1.assistant.TextChatRequest;
import ai.sensorycloud.api.v1.assistant.TextChatResponse;
import ai.sensorycloud.tokenManager.TokenManager;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import io.grpc.testing.GrpcCleanupRule;

import static org.mockito.Mockito.*;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.awaitility.Awaitility.*;

import org.junit.Before;
import org.junit.Rule;

public class AssistantServiceTest extends TestCase {

    final Metadata.Key<String> authKey = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
    final String authValue = "Bearer Some-Oauth-Token";

    final public SDKInitConfig mockConfig = new SDKInitConfig(
            "host",
            false,
            "tenantID",
            SDKInitConfig.EnrollmentType.NONE,
            "doesntmatter",
            "deviceID",
            "deviceName"
    );

    final ChatMessage chatMessage1 = ChatMessage.newBuilder()
            .setRole(ChatRole.SYSTEM)
            .setContent("Some system chat message")
            .build();

    final ChatMessage chatMessage2 = ChatMessage.newBuilder()
            .setRole(ChatRole.USER)
            .setContent("Some user chat message")
            .build();

    final ChatMessage chatMessage3 = ChatMessage.newBuilder()
            .setRole(ChatRole.ASSISTANT)
            .setContent("Some assistant chat message")
            .build();

    final TextChatRequest expectedChatRequest = TextChatRequest.newBuilder()
            .setModelName("Some Model Name")
            .addAllMessages(Arrays.asList(chatMessage1, chatMessage2, chatMessage3))
            .build();

    final TextChatResponse expectedChatResponse = TextChatResponse.newBuilder()
            .setMessage(chatMessage3)
            .build();

    private final ServerInterceptor mockServerInterceptor = mock(ServerInterceptor.class, delegatesTo(
            new ServerInterceptor() {
                @Override
                public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
                    String oauthToken = headers.get(authKey);
                    assertNotNull("OAuth token should be present", oauthToken);
                    assertEquals("OAuth token should match", authValue, oauthToken);
                    return next.startCall(call, headers);
                }
            }
    ));

    private final AssistantServiceGrpc.AssistantServiceImplBase serviceImpl =
            mock(AssistantServiceGrpc.AssistantServiceImplBase.class, delegatesTo(
                new AssistantServiceGrpc.AssistantServiceImplBase() {
                    @Override
                    public void textChat(TextChatRequest request, StreamObserver<TextChatResponse> responseObserver) {
                        assertEquals("Request should match", expectedChatRequest, request);
                        responseObserver.onNext(expectedChatResponse);
                        responseObserver.onCompleted();
                    }
                }
    ));

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    public AssistantService service;
    public TokenManager mockTokenManager;
    public boolean responseReceived = false;

    @Before
    public void setUp() throws Exception {
        responseReceived = false;

        MockConfig conf = new MockConfig();
        conf.setConfig(mockConfig);

        String serverName = InProcessServerBuilder.generateName();
        grpcCleanup.register(InProcessServerBuilder.forName(serverName).directExecutor()
                .addService(ServerInterceptors.intercept(serviceImpl, mockServerInterceptor))
                .build().start());
        ManagedChannel channel = grpcCleanup.register(InProcessChannelBuilder.forName(serverName)
                .directExecutor().build());

        mockTokenManager = mock(TokenManager.class);
        Metadata mockHeader = new Metadata();
        mockHeader.put(authKey, authValue);
        ClientInterceptor mockAuth = MetadataUtils.newAttachHeadersInterceptor(mockHeader);
        when(mockTokenManager.getAuthorizationMetadata()).thenReturn(mockAuth);

        service = new AssistantService(mockTokenManager, channel);
    }

    public void testTextChat() {
        service.textChat(
                "Some Model Name",
                expectedChatRequest.getMessagesList(),
                new AssistantService.TextChatListener() {
                    @Override
                    public void onSuccess(TextChatResponse response) {
                        assertEquals("Response should match", expectedChatResponse, response);
                        responseReceived = true;
                    }

                    @Override
                    public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
                });

        await().until(() -> responseReceived);
    }

}
