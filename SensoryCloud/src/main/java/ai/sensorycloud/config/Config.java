package ai.sensorycloud.config;

/**
 * Configuration object for setting default values for Sensory Cloud
 */
public class Config {

    /**
     * Configurations for the cloud host to connect to
     */
    public static class CloudConfig {
        /**
         * The Cloud host for Sensory Cloud to use
         */
        public String host;

        public CloudConfig(String host) {
            this.host = host;
        }
    }

    /**
     * Configurations for the tenant that Sensory Cloud should use
     */
    public static class TenantConfig {
        /**
         * Tenant ID to use during device enrollment
         */
        public String tenantId;

        public TenantConfig(String tenantId) {
            this.tenantId = tenantId;
        }
    }

    /**
     * Configurations for device specific information
     */
    public static class DeviceConfig {
        /**
         * Device specific identifier that enrollments are associated with
         */
        public String deviceId;
        /**
         * Default language/region code to use during audio enrollments and authentications
         */
        public String defaultLanguageCode;

        public DeviceConfig(String deviceId, String defaultLanguageCode) {
            this.deviceId = deviceId;
            this.defaultLanguageCode = defaultLanguageCode;
        }
    }

    public CloudConfig cloudConfig;
    public TenantConfig tenantConfig;
    public DeviceConfig deviceConfig;

    public Config(CloudConfig cloudConfig, TenantConfig tenantConfig, DeviceConfig deviceConfig) {
        this.cloudConfig = cloudConfig;
        this.tenantConfig = tenantConfig;
        this.deviceConfig = deviceConfig;
    }
}
