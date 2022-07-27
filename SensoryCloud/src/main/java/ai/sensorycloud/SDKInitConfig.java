package ai.sensorycloud;

import java.util.Arrays;

/**
 * All configurations required to initialize the Sensory Cloud SDK
 */
public class SDKInitConfig {

    public SDKInitConfig(String fullyQualifiedDomainName, boolean isSecure, String tenantID, EnrollmentType enrollmentType, String credential, String deviceID, String deviceName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        this.isSecure = isSecure;
        this.tenantID = tenantID;
        this.enrollmentType = enrollmentType;
        this.credential = credential;
        this.deviceID = deviceID;
        this.deviceName = deviceName;
    }

    /**
     * The possible authentication methods for device enrollment
     */
    public enum EnrollmentType {
        NONE("none"),
        SHARED_SECRET("sharedSecret"),
        JWT("jwt");

        private final String value;

        EnrollmentType(String value) {
            this.value = value;
        }

        /**
         * @return the Enum representation for the enrollment type string.
         * @throws IllegalArgumentException if unknown enrollment type.
         */
        public static EnrollmentType fromString(String s) throws IllegalArgumentException {
            return Arrays.stream(EnrollmentType.values())
                    .filter(v -> v.value.equals(s))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("unknown enrollment type: " + s));
        }
    }

    /**
     * The fully qualified domain name of the Sensory Cloud server to communicate with
     */
    public String fullyQualifiedDomainName;

    /**
     * Tells if the SDK should use a secure connection to the Sensory Cloud server or not
     */
    public boolean isSecure;

    /**
     * Tenant ID to use during device enrollment
     */
    public String tenantID;

    /**
     * The level of authentication required to enroll new devices into the Sensory Cloud server
     * If the device has been enrolled during a previous app session, this field is ignored
     */
    public EnrollmentType enrollmentType;

    /**
     * Credential for device enrollment
     * Depending on the `EnrollmentType` this may be blank, the shared secret, or the private key to create a JWT with
     * If the device has been enrolled during a previous app session, this field is ignored
     */
    public String credential;

    /**
     * Unique identifier for the current device
     */
    public String deviceID;

    /**
     * Display name of the enrolling device
     */
    public String deviceName;
}