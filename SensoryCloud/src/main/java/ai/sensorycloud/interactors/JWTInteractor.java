package ai.sensorycloud.interactors;

import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class JWTInteractor {

    public static String genJWT(String enrollmentKey, String deviceName, String tenantID, String clientID) throws Exception {
        // load the private key
        KeyFactory kf = KeyFactory.getInstance("ed25519"); // maybe just "edDSA"
        // TODO: hex string to bytes, not utf-8
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(enrollmentKey.getBytes(StandardCharsets.UTF_8));
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
}
