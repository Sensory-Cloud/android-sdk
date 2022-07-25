package ai.sensorycloud.tokenManager;

/**
 * Creates a signed JWT for device enrollment
 */
public interface JWTSigner {
    /**
     * Creates a signed JWT used for device enrollment
     * This is only used if the enrollment type is `jwt`
     *
     * @param enrollmentKey private signing key. This will be a hex string of the raw private key
     * @param deviceName    device name to use in JWT
     * @param tenantID      tenant ID to use in JWT
     * @param clientID      client ID to use in JWT
     * @return The final signed JWT that may be used for device enrollment
     * @throws Exception If an error occurs during signing
     */
    String signJWT(String enrollmentKey, String deviceName, String tenantID, String clientID) throws Exception;
}
