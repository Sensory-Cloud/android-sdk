package ai.sensorycloud.interactors;

import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

/**
 * Helper class for generating enrollment JWTs
 * A security provider should be set by calling `Security.addProvider(...)` before using this class
 * (Initializer.initialize uses this implementation when the enrollment type is JWT)
 */
public class JWTInteractor {

    /**
     * Generates an enrollment JWT
     * @param enrollmentKey private signing key. This value should be a hex string of the private key.
     * @param deviceName device friendly name
     * @param tenantID tenant ID to enroll into
     * @param clientID client ID of the device
     * @return A signed JWT that may be used for device enrollment
     * @throws Exception thrown if the private key cannot be parsed
     */
    public static String genJWT(String enrollmentKey, String deviceName, String tenantID, String clientID) throws Exception {
        // load the private key
        byte[] keyBytes = hexToBytes(enrollmentKey);
        KeyFactory kf = KeyFactory.getInstance("ECDSA"); // edDSA?
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        PrivateKey key = kf.generatePrivate(spec);

        // header
        JSONObject header = new JSONObject();
        header.put("alg", "edDSA");
        header.put("typ", "JWT");
        String headerBase64 = Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(header.toString().getBytes(StandardCharsets.UTF_8));

        // payload
        JSONObject payload = new JSONObject();
        payload.put("name", deviceName);
        payload.put("tenant", tenantID);
        payload.put("client", clientID);
        String payloadBase64 = Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(payload.toString().getBytes(StandardCharsets.UTF_8));

        // signature
        byte[] toSign = (headerBase64 + "." + payloadBase64).getBytes(StandardCharsets.UTF_8);
        Signature sig = Signature.getInstance("Ed25519");
        sig.initSign(key);
        sig.update(toSign);
        byte[] signed = sig.sign();
        String signedBase64 = Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(signed);

        return headerBase64 + "." + payloadBase64 + "." + signedBase64;
    }

    static byte[] hexToBytes(String str) throws IllegalArgumentException {
        int len = str.length();
        if (len%2 != 0) {
            throw new IllegalArgumentException("hex string must have even length");
        }

        byte[] data = new byte[len/2];
        for (int i = 0; i < len; i += 2) {
            data[i/2] = (byte) (
                    (Character.digit(str.charAt(i), 16) << 4)
                    + Character.digit(str.charAt(i+1), 16)
            );
        }
        return data;
    }
}
