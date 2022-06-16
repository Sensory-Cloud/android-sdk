package ai.sensorycloud;

import ai.sensorycloud.api.v1.management.DeviceResponse;
import ai.sensorycloud.interactors.JWTInteractor;
import ai.sensorycloud.service.OAuthService;
import ai.sensorycloud.tokenManager.SecureCredentialStore;
import ai.sensorycloud.interactors.INIInteractor;

public class Initializer {
    public static void initialize(
            OAuthService oAuthService,
            String filename,
            OAuthService.EnrollDeviceListener listener) {

        try {
            INIInteractor parser = new INIInteractor(filename);
            SDKInitConfig config = parser.getConfig();
            initialize(oAuthService, config, listener);
        } catch (Exception err) {
            Config.sharedConfig = null;
            listener.onFailure(err);
        }
    }

    public static void initialize(
            OAuthService oauthService,
            SDKInitConfig config,
            OAuthService.EnrollDeviceListener listener) {
        try {
            // TODO: defaults for deviceID/deviceName

            // Save config in memory
            Config.sharedConfig = config;

            SecureCredentialStore credentialStore = oauthService.getSecureCredentialStore();

            if (credentialStore.getClientId().isPresent() && credentialStore.getClientSecret().isPresent()) {
                // SDK has been previously enrolled
                listener.onSuccess(null);
                return;
            }

            // generate oauth credentials
            OAuthService.OAuthClient oauthCredentials = oauthService.generateCredentials();

            // Assemble enrollment credential
            String credential = "";
            switch (config.enrollmentType) {
                case NONE:
                    break;
                case SHARED_SECRET:
                    credential = config.credential;
                    break;
                case JWT:
                    credential = JWTInteractor.genJWT(config.credential, config.deviceName, config.tenantID, oauthCredentials.clientId);
                    break;
            }

            // Enroll device
            oauthService.register(
                    config.deviceName,
                    credential,
                    oauthCredentials.clientId,
                    oauthCredentials.clientSecret,
                    new OAuthService.EnrollDeviceListener() {
                        @Override
                        public void onSuccess(DeviceResponse response) {
                            try {
                                credentialStore.setCredentials(oauthCredentials.clientId, oauthCredentials.clientSecret);
                                listener.onSuccess(response);
                            } catch (Exception err) {
                                Config.sharedConfig = null;
                                listener.onFailure(err);
                            }
                        }

                        @Override
                        public void onFailure(Throwable t) {
                            Config.sharedConfig = null;
                            listener.onFailure(t);
                        }
                    }
            );
        } catch (Exception err) {
            Config.sharedConfig = null;
            listener.onFailure(err);
        }
    }
}

