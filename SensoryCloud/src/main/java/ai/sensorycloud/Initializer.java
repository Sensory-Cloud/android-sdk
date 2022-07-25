package ai.sensorycloud;

import java.io.InputStream;

import ai.sensorycloud.api.v1.management.DeviceResponse;
import ai.sensorycloud.service.OAuthService;
import ai.sensorycloud.tokenManager.JWTSigner;
import ai.sensorycloud.tokenManager.SecureCredentialStore;
import ai.sensorycloud.interactors.INIInteractor;

/***
 * Static initializer class. The Sensory Cloud SDK *must* be initialized every time the app is launched
 */
public class Initializer {
    /***
     * Initializes the Sensory Cloud SDK from an open input stream of a configuration file.
     * This will load SDK configurations and will automatically register the device with Sensory Cloud
     * @param oAuthService OAuth service to register the device with
     * @param jwtSigner Signer to be used for creating an enrollment JWT, may be null if enrollment type is not `jwt`
     * @param inputStream Input stream for a configuration ini file
     * @param deviceID Optional device ID. If this is non-null and non-empty this will override the deviceID in the config file
     * @param deviceName Optional device name. If this is non-null and non-empty this will override the device name in the config file
     * @param listener Listener that will be updated when initialization is complete. The response may be null if the device has been previously enrolled
     */
    public static void initialize(
            OAuthService oAuthService,
            JWTSigner jwtSigner,
            InputStream inputStream,
            String deviceID,
            String deviceName,
            OAuthService.EnrollDeviceListener listener) {
        try {
            INIInteractor parser = new INIInteractor(inputStream);
            SDKInitConfig config = parser.getConfig();
            if (deviceID != null && !deviceID.isEmpty()) {
                config.deviceID = deviceID;
            }
            if (deviceName != null || !deviceName.isEmpty()) {
                config.deviceName = deviceName;
            }
            initialize(oAuthService, jwtSigner, config, listener);
        } catch (Exception err) {
            Config.sharedConfig = null;
            listener.onFailure(err);
        }
    }

    /***
     * Initializes the Sensory Cloud SDK from a static configuration object.
     * This will load SDK configurations and will automatically register the device with Sensory Cloud
     * @param oAuthService OAuth service to register the device with
     * @param jwtSigner Signer to be used for creating an enrollment JWT, may be null if enrollment type is not `jwt`
     * @param config Static configuration object to initialize the SDK with
     * @param listener Listener that will be updated when initialization is complete. The response may be null if the device has been previously enrolled
     */
    public static void initialize(
            OAuthService oAuthService,
            JWTSigner jwtSigner,
            SDKInitConfig config,
            OAuthService.EnrollDeviceListener listener) {
        try {
            // Save config in memory
            Config.sharedConfig = config;

            SecureCredentialStore credentialStore = oAuthService.getSecureCredentialStore();

            if (credentialStore.getClientId().isPresent() && credentialStore.getClientSecret().isPresent()) {
                // SDK has been previously enrolled
                listener.onSuccess(null);
                return;
            }

            // generate oauth credentials
            OAuthService.OAuthClient oauthCredentials = oAuthService.generateCredentials();

            // Assemble enrollment credential
            String credential = "";
            switch (config.enrollmentType) {
                case NONE:
                    break;
                case SHARED_SECRET:
                    credential = config.credential;
                    break;
                case JWT:
                    if (jwtSigner == null) {
                        throw new NullPointerException("jwt signer must not be null for the jwt enrollment type");
                    }
                    credential = jwtSigner.signJWT(config.credential, config.deviceName, config.tenantID, oauthCredentials.clientId);
                    break;
            }

            // Enroll device
            oAuthService.register(
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
