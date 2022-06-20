package ai.sensorycloud.interactors;

import junit.framework.TestCase;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Before;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;

public class JWTInteractorTest extends TestCase {

    @Before
    public void setUp() throws Exception {
        Security.addProvider(new BouncyCastleProvider());
    }

    // TODO: FIXME
    public void testMakeJWT() throws Exception {
        String key = "de6101434b38c83dcc5d3795d42aad828d4f4ac515908c10989780c450287c8c";

        byte[] keyBytes = JWTInteractor.hexToBytes(key);
        KeyFactory kf = KeyFactory.getInstance("ECDSA");
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        PrivateKey pkey = kf.generatePrivate(spec);

        fail("FIXME");

//        String token = JWTInteractor.genJWT(key, "name", "tenant", "client");
//
//        assertFalse("Token should not be empty", token.isEmpty());
    }
}
