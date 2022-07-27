package ai.sensorycloud.interactors;

import junit.framework.TestCase;

import java.io.InputStream;

import ai.sensorycloud.SDKInitConfig;

public class INIInteractorTest extends TestCase {

    public void testBasic() throws Exception {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("basic.ini");
        INIInteractor parser = new INIInteractor(stream);

        SDKInitConfig expected = new SDKInitConfig(
                "fqdn",
                true,
                "tenant",
                SDKInitConfig.EnrollmentType.NONE,
                "credential",
                "deviceID",
                "deviceName"
        );

        SDKInitConfig parsed = parser.getConfig();
        checkSDKsEqual(expected, parsed);
    }

    public void testComments() throws Exception {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("comments.ini");
        INIInteractor parser = new INIInteractor(stream);

        SDKInitConfig expected = new SDKInitConfig(
                "fqdn",
                true,
                "tenant",
                SDKInitConfig.EnrollmentType.SHARED_SECRET,
                "credential",
                "deviceID",
                "deviceName"
        );

        SDKInitConfig parsed = parser.getConfig();
        checkSDKsEqual(expected, parsed);
    }

    public void testNoDeviceInfo() throws Exception {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("noDeviceInfo.ini");
        INIInteractor parser = new INIInteractor(stream);

        SDKInitConfig expected = new SDKInitConfig(
                "sensorycloud.ai:443",
                false,
                "tenant",
                SDKInitConfig.EnrollmentType.SHARED_SECRET,
                "credential",
                "",
                ""
        );

        SDKInitConfig parsed = parser.getConfig();
        checkSDKsEqual(expected, parsed);
    }

    public void testMissingConfig() throws Exception {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("missingConfig.ini");
        INIInteractor parser = new INIInteractor(stream);

        try {
            parser.getConfig();
            fail("Exception should occur on missing config");
        } catch (Exception ignored) { }
    }

    public void testBadEnrollmentType() throws Exception {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("badEnrollmentType.ini");
        INIInteractor parser = new INIInteractor(stream);

        try {
            parser.getConfig();
            fail("Exception should occur on bad enrollment type");
        } catch (Exception ignored) { }
    }

    public void testMissingFile() throws Exception {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("bogus.ini");

        try {
            INIInteractor parser = new INIInteractor(stream);
            fail("Exception should occur on missing file");
        } catch (Exception ignored) { }
    }

    public void checkSDKsEqual(SDKInitConfig expected, SDKInitConfig actual) {
        assertEquals(expected.fullyQualifiedDomainName, actual.fullyQualifiedDomainName);
        assertEquals(expected.isSecure, actual.isSecure);
        assertEquals(expected.tenantID, actual.tenantID);
        assertEquals(expected.enrollmentType, actual.enrollmentType);
        assertEquals(expected.credential, actual.credential);
        assertEquals(expected.deviceID, actual.deviceID);
        assertEquals(expected.deviceName, actual.deviceName);
    }
}
