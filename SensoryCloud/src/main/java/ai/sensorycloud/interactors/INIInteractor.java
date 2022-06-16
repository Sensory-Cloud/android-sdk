package ai.sensorycloud.interactors;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;

import ai.sensorycloud.SDKInitConfig;

/**
 * Class for parsing config INI files
 *
 * This is not a full INI file parser, this implementation does not support INI sections
 */
public class INIInteractor {

    // Truthy values for boolean values
    private static final String[] TRUTHY_VALUES = {"ture", "True", "TRUE", "T", "t", "yes", "Yes", "YES", "1"};

    // Configuration keys that are parsed
    private static final String FQDN = "fullyQualifiedDomainName";
    private static final String IS_SECURE = "isSecure";
    private static final String TENANT_ID = "tenantID";
    private static final String ENROLLMENT_TYPE = "enrollmentType";
    private static final String CREDENTIAL = "credential";
    private static final String DEVICE_ID = "deviceID";
    private static final String DEVICE_NAME = "deviceName";

    private Properties props = new Properties();

    /**
     * Creates a new INIParser instance
     * @param filename filename of the config INI file to load
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public INIInteractor(String filename) throws java.io.FileNotFoundException, java.io.IOException {
        FileInputStream inputStream = new FileInputStream(filename);
        props.load(inputStream);
    }

    /**
     * Parses the config file and returns a SDKInitConfig object
     * @return The parsed config file
     * @throws Exception thrown on missing config or invalid enrollment type
     */
    public SDKInitConfig getConfig() throws Exception {
        String fqdn = loadProperty(FQDN, null);
        String isSecureStr = loadProperty(IS_SECURE, null);
        Boolean isSecure = Arrays.stream(TRUTHY_VALUES).anyMatch(x -> x.equals(isSecureStr));
        String tenant = loadProperty(TENANT_ID, null);
        String enrollmentTypeStr = loadProperty(ENROLLMENT_TYPE, null);
        SDKInitConfig.EnrollmentType enrollmentType = SDKInitConfig.EnrollmentType.fromString(enrollmentTypeStr);
        String credential = loadProperty(CREDENTIAL, null);
        String deviceID = loadProperty(DEVICE_ID, "");
        String deviceName = loadProperty(DEVICE_NAME, "");

        return new SDKInitConfig(fqdn, isSecure, tenant, enrollmentType, credential, deviceID, deviceName);
    }

    private String loadProperty(String key, String defaultValue) throws Exception {
        String value = props.getProperty(key);
        if (value == null && defaultValue == null) {
            throw new Exception("Missing configuration for `" + key + "`");
        } else if (value == null) {
            return defaultValue;
        }
        return value;
    }
}
