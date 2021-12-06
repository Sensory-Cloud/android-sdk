package inc.sensory.sensoryclouddemo;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import inc.sensory.sensorycloud.config.Config;
import inc.sensory.sensorycloud.service.OAuthService;
import inc.sensory.sensorycloud.tokenManager.DefaultSecureCredentialStore;
import inc.sensory.sensorycloud.tokenManager.SecureCredentialStore;
import inc.sensory.sensoryclouddemo.databinding.FragmentFirstBinding;
import io.sensory.api.common.TokenResponse;
import io.sensory.api.v1.management.DeviceResponse;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    private static final String LOG_TAG = "LoginView";

    private Config sensoryConfig;
    private DefaultSecureCredentialStore credentialStore;
    private OAuthService oAuthService;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // TODO: - proper device id
        sensoryConfig = new Config(
                new Config.CloudConfig("10.0.2.2:50051"),
                new Config.TenantConfig("b6e1b848-75da-46cb-aad8-981cc3ccebcd"),
                new Config.DeviceConfig("f6921e40-4e9c-4580-9734-5fdf6d22d983", "en_US"));

        credentialStore = new DefaultSecureCredentialStore(getContext());
        oAuthService = new OAuthService(sensoryConfig, credentialStore);

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = binding.usernameField.getText().toString();
                String password = binding.passwordField.getText().toString();
                if( username.isEmpty() || password.isEmpty() ) {
                    Log.i(LOG_TAG, "username and password must be entered");
                    return;
                }
                enrollDevice(username, password);
            }
        });
    }

    public void enrollDevice(String username, String password) {

        OAuthService.OAuthClient client = oAuthService.generateCredentials();
        Log.i(LOG_TAG, "Generated credentials with clientID: " + client.clientId);
        credentialStore.setCredentials(client.clientId, client.clientSecret);

        oAuthService.register(
                username,
                password,
                new OAuthService.EnrollDeviceListener() {
            @Override
            public void onSuccess(DeviceResponse response) {
                Log.i(LOG_TAG, "Received enrollment response");
                attemptGetToken();
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e(LOG_TAG, t.getMessage());
                t.printStackTrace();
            }
        });
    }

    public void attemptGetToken() {
        Config config = new Config(
                new Config.CloudConfig("10.0.2.2:50051"),
                new Config.TenantConfig("b6e1b848-75da-46cb-aad8-981cc3ccebcd"),
                new Config.DeviceConfig("device", "en_US"));
        SecureCredentialStore credentialStore = new DefaultSecureCredentialStore(getContext());
        OAuthService service = new OAuthService(config, credentialStore);

        service.getToken( new OAuthService.GetTokenListener() {
            @Override
            public void onSuccess(TokenResponse response) {
                Log.i(LOG_TAG, response.getAccessToken());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e(LOG_TAG, t.getMessage());
                t.printStackTrace();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}