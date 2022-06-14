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

    /**
     * Securely saves arbitrary data in secure storage. This is used for saving enrollment tokens on device
     * @param id string identifier to save the data under
     * @param data data to securely save
     * @throws Exception if an error occurs while saving to secure storage
     */
    void saveData(String id, byte[] data) throws Exception;

    /**
     * Loads arbitrary data from secure storage. This is used for loading enrollment tokens on device
     * @param id string identifier of the data to load
     * @return the saved data
     * @throws Exception if an error occurs while loading from the secure credential store or if the item is not found
     */
    byte[] loadData(String id) throws Exception;

    /**
     * Deletes saved data from secure storage
     * @param id string identifier of the data to delete
     * @throws Exception if an error occurs while deleting the data. No error is thrown if the item is not found
     */
    void deleteData(String id) throws Exception;
}
