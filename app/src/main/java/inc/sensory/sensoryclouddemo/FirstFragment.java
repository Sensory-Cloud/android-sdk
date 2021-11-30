package inc.sensory.sensoryclouddemo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import inc.sensory.sensorycloud.service.OAuthService;
import inc.sensory.sensoryclouddemo.databinding.FragmentFirstBinding;
import io.sensory.api.common.TokenResponse;
import io.sensory.api.v1.management.DeviceResponse;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptEnrollDevice();
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    public void attemptEnrollDevice() {
        OAuthService service = new OAuthService();

        service.enrollDevice(
                "10.0.2.2:50051",
                "abcdef01-2345-6789-0123-456789abcdef",
                "b6e1b848-75da-46cb-aad8-981cc3ccebcd",
                "Niles Android",
                "Enroll123Sensory!!",
                "95bd507d-e200-4721-87d5-bfdcfa3f5ab4",
                "407833043d144c7c8c866c97575ef3f1",
                new OAuthService.EnrollDeviceListener() {
            @Override
            public void onSuccess(DeviceResponse response) {
                System.out.println("Received enrollment response");
                attemptGetToken();
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println(t.getMessage());
                t.printStackTrace();
            }
        });

    }

    public void attemptGetToken() {
        OAuthService service = new OAuthService();

        service.getToken(
                "10.0.2.2:50051",
                "95bd507d-e200-4721-87d5-bfdcfa3f5ab4",
                "407833043d144c7c8c866c97575ef3f1",
                new OAuthService.GetTokenListener() {
            @Override
            public void onSuccess(TokenResponse response) {
                System.out.println(response.getAccessToken());
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}