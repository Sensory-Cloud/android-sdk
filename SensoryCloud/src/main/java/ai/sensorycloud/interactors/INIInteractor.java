package ai.sensorycloud.interactors;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.UUID;

import ai.sensorycloud.SDKInitConfig;
import ai.sensorycloud.tokenManager.DefaultSecureCredentialStore;
import ai.sensorycloud.tokenManager.SecureCredentialStore;

/**
 * Class for parsing config INI files
 *
 * This is *not* a full featured INI file parser. For example, this implementation ignores INI sections
 */
public class INIInteractor {

    // Strings that will evaluate as true when used as a boolean
    private static final String[] TRUTHY_VALUES = {"true", "True", "TRUE", "T", "t", "yes", "Yes", "YES", "1"};

    // Configuration keys that are parsed
    private static final String FQDN = "fullyQualifiedDomainName";
    private static final String IS_SECURE = "isSecure";
    private static final String TENANT_ID = "tenantID";
    private static final String ENROLLMENT_TYPE = "enrollmentType";
    private static final String CREDENTIAL = "credential";
    private static final String DEVICE_ID = "deviceID";
    private static final String DEVICE_NAME = "deviceName";

    private static final String DEFAULT_DEVICE_ID = "defaultDeviceID";

    private Properties props = new Properties();

    private SecureCredentialStore secureCredentialStore;

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
     * Creates a new INIParser instance
     * @param stream Input stream of the config file to load
     * @throws java.io.IOException
     */
    public INIInteractor(InputStream stream) throws java.io.IOException {
        props.load(stream);
    }

    /**
     * Creates a new INIParser instance with a default device ID and name generated by the SDK
     * @param filename filename of the config INI file to load
     * @param secureCredentialStore instance of SecureCredentialStore to use for loading and saving data.
     *                              If you don't have your own implementation of a secure credential storage,
     *                              you can pass in an instance of DefaultSecureCredentialStorage.
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public INIInteractor(String filename, SecureCredentialStore secureCredentialStore) throws java.io.FileNotFoundException, java.io.IOException {
        this.secureCredentialStore = secureCredentialStore;
        FileInputStream inputStream = new FileInputStream(filename);
        props.load(inputStream);
    }

    /**
     * Creates a new INIParser instance with a default device ID and name generated by the SDK
     * @param stream Input stream of the config file to load
     * @param secureCredentialStore instance of SecureCredentialStore to use for loading and saving data.
     *                              If you don't have your own implementation of a secure credential storage,
     *                              you can pass in an instance of DefaultSecureCredentialStorage.
     * @throws java.io.IOException
     */
    public INIInteractor(InputStream stream, SecureCredentialStore secureCredentialStore) throws java.io.IOException {
        this.secureCredentialStore = secureCredentialStore;
        props.load(stream);
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
        String deviceID = loadProperty(DEVICE_ID, getDefaultDeviceId());
        String deviceName = loadProperty(DEVICE_NAME, deviceID);

        return new SDKInitConfig(fqdn, isSecure, tenant, enrollmentType, credential, deviceID, deviceName);
    }

    private String loadProperty(String key, String defaultValue) throws Exception {
        String value = props.getProperty(key);
        if (value == null && defaultValue == null) {
            throw new Exception("Missing configuration for `" + key + "`");
        } else if (value == null) {
            return defaultValue;
        }

        // clean up any comments/extra spacing/quotes on the value
        return value.split(" ", 2)[0].trim().replace("\"", "");
    }

    private String getDefaultDeviceId() throws Exception {
        if(secureCredentialStore==null){
            return "";
        }
        if(!secureCredentialStore.loadData(DEFAULT_DEVICE_ID).isPresent()){
            String uuid = UUID.randomUUID().toString();
            secureCredentialStore.saveData(DEFAULT_DEVICE_ID,uuid.getBytes());
            return uuid;
        }
        return new String(secureCredentialStore.loadData(DEFAULT_DEVICE_ID).orElse(new byte[0]));
    }
}
