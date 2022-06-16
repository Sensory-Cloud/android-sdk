package ai.sensorycloud.demo;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.UUID;

import ai.sensorycloud.Config;
import ai.sensorycloud.service.OAuthService;
import ai.sensorycloud.tokenManager.DefaultSecureCredentialStore;
import ai.sensorycloud.demo.databinding.LoginFragmentBinding;
import ai.sensorycloud.api.v1.management.DeviceResponse;

public class LoginFragment extends Fragment {

    private LoginFragmentBinding binding;

    private static final int REQUEST_CODE = 1;
    private static final String LOG_TAG = "LoginView";

    private final String clientAppPrefs = "SensoryClient";
    private final String deviceIDKey = "deviceID";
    private String deviceID;

    private Config sensoryConfig;
    private DefaultSecureCredentialStore credentialStore;
    private OAuthService oAuthService;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        credentialStore = new DefaultSecureCredentialStore(getContext(), "");

        // Check if we're logged in
        try {
            credentialStore.getClientId();
            credentialStore.getClientSecret();
            showLoggedIn();
        } catch (Exception e) {
            deviceID = UUID.randomUUID().toString();
            SharedPreferences prefs = getContext().getSharedPreferences(clientAppPrefs, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString(deviceIDKey, deviceID);
            editor.apply();

            sensoryConfig = new Config(
                    new Config.CloudConfig("10.0.2.2:50050"),
                    new Config.TenantConfig("b6e1b848-75da-46cb-aad8-981cc3ccebcd"),
                    new Config.DeviceConfig(deviceID, "en_US"));

            oAuthService = new OAuthService(sensoryConfig, credentialStore);
        }

        binding = LoginFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Request audio permissions if not allowed
        boolean hasAudio = (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED);
        boolean hasVideo = (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED);

        if( !hasAudio || !hasVideo ) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.RECORD_AUDIO, Manifest.permission.CAMERA}, REQUEST_CODE);
        }

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
        try {
            credentialStore.setCredentials(client.clientId, client.clientSecret);
        } catch (Exception e) {
            Log.e(LOG_TAG, e.getMessage());
            e.printStackTrace();
            return;
        }

        oAuthService.register(
                username,
                password,
                new OAuthService.EnrollDeviceListener() {
            @Override
            public void onSuccess(DeviceResponse response) {
                Log.i(LOG_TAG, "Received enrollment response");
                showLoggedIn();
            }

            @Override
            public void onFailure(Throwable t) {
                try {
                    credentialStore.setCredentials("", "");
                } catch (Exception e) {
                    Log.e(LOG_TAG, e.getMessage());
                    e.printStackTrace();
                }
                Log.e(LOG_TAG, t.getMessage());
                t.printStackTrace();
            }
        });
    }

    public void showLoggedIn() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                NavHostFragment.findNavController(LoginFragment.this).navigate(R.id.action_login);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}