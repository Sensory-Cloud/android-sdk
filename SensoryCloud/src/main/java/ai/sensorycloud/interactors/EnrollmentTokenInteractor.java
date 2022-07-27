package ai.sensorycloud.interactors;

import java.nio.ByteBuffer;
import java.util.Optional;

import ai.sensorycloud.api.common.EnrollmentToken;
import ai.sensorycloud.tokenManager.SecureCredentialStore;

/**
 * Class used to securely save and manage enrollment tokens
 */
public class EnrollmentTokenInteractor {

    private final String TOKEN_SUFFIX = "_token";
    private final String EXPIRATION_SUFFIX = "_expiration";
    private static ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);

    private SecureCredentialStore secureCredentialStore;

    /**
     * Initialize an instance of EnrollmentTokenInteractor
     * @param secureCredentialStore Secure storage to save enrollment tokens with
     */
    public EnrollmentTokenInteractor(SecureCredentialStore secureCredentialStore) {
        this.secureCredentialStore = secureCredentialStore;
    }

    /**
     * Securely saves a new enrollment token for the given enrollment ID
     * If a token is already saved for the enrollment ID, the previous token will be deleted
     * @param enrollmentID Enrollment ID of the token to save
     * @param token Enrollment token object returned by the Sensory Cloud server
     * @throws Exception thrown if SecureCredentialStore generates an error
     */
    public void saveEnrollmentToken(String enrollmentID, EnrollmentToken token) throws Exception {
        deleteEnrollmentToken(enrollmentID);

        secureCredentialStore.saveData(enrollmentID + TOKEN_SUFFIX, token.getToken().toByteArray());

        if (token.getExpiration() > 0) {
            long expires = System.currentTimeMillis() + (token.getExpiration() * 1000L);
            byte[] expiresBytes = longToBytes(expires);
            secureCredentialStore.saveData(enrollmentID + EXPIRATION_SUFFIX, expiresBytes);
        }
    }

    /**
     * Retrieves a saved enrollment token from secure storage
     * ExpiredTokenException will be thrown if the enrollment token has expired
     * @param enrollmentID enrollment ID to get the enrollment token for
     * @return The saved enrollment token or an empty optional if no token was found
     * @throws Exception thrown if the token is expired or if SecureCredentialStore generates an error
     */
    public Optional<byte[]> getEnrollmentToken(String enrollmentID) throws Exception {
        Optional<byte[]> token = secureCredentialStore.loadData(enrollmentID + TOKEN_SUFFIX);
        if (!token.isPresent()) {
            return Optional.empty();
        }

        Optional<byte[]> expirationBytes = secureCredentialStore.loadData(enrollmentID + EXPIRATION_SUFFIX);
        if (!expirationBytes.isPresent()) {
            // token has no expiration
            return token;
        }

        long expiration = bytesToLong(expirationBytes.get());
        if (System.currentTimeMillis() > expiration) {
            deleteEnrollmentToken(enrollmentID);
            throw new ExpiredTokenException("The enrollment token has expired");
        }

        return token;
    }

    /**
     * Deletes a saved enrollment token
     * @param enrollmentID The enrollmentID of the token to delete
     * @throws Exception thrown if SecureCredentialStore generates an error
     */
    public void deleteEnrollmentToken(String enrollmentID) throws  Exception {
        secureCredentialStore.deleteData(enrollmentID + TOKEN_SUFFIX);
        secureCredentialStore.deleteData(enrollmentID + EXPIRATION_SUFFIX);
    }

    private static byte[] longToBytes(long x) {
        buffer.clear();
        buffer.putLong(0, x);
        return buffer.array();
    }

    private static long bytesToLong(byte[] bytes) {
        buffer.clear();
        buffer.put(bytes, 0, bytes.length);
        buffer.flip();//need flip
        return buffer.getLong();
    }
}
