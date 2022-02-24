package ai.sensorycloud.tokenManager;

/**
 * Generic interface for a secure credential store that OAuth service may use
 */
public interface SecureCredentialStore {
    /**
     * Fetches the client ID from secure storage
     * @return the saved client ID
     * @throws Exception if an error occurs while loading from the secure credential store or if the item is not found
     */
    String getClientId() throws Exception;

    /**
     * Fetches the client Secret from secure storage
     * @return the saved client Secret
     * @throws Exception if an error occurs while loading from the secure credential store or if the item is not found
     */
    String getClientSecret() throws Exception;
}
