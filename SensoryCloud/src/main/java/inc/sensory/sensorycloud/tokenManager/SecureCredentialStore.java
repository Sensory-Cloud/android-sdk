package inc.sensory.sensorycloud.tokenManager;

/**
 * Generic interface for a secure credential store that OAuth service may use
 */
public interface SecureCredentialStore {
    /**
     * @return The saved clientID in the credential store
     */
    String getClientId();

    /**
     * @return The saved client secret in the credential store
     */
    String getClientSecret();
}
