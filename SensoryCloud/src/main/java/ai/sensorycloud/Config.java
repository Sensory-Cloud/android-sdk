package ai.sensorycloud;

import ai.sensorycloud.SDKInitConfig;

/**
 * Configuration object for setting default values for Sensory Cloud
 */
public class Config {

    static SDKInitConfig sharedConfig;

    /**
     * The main configurations used by the Sensory Cloud SDK
     * This config is set when `Initializer.initialize(...)` is called
     * @return the saved configuration object
     */
    public static SDKInitConfig getSharedConfig() {
        return sharedConfig;
    }

    /**
     * Default language code used for audio calls.
     */
    public static String defaultLanguageCode = "en-US";


    // TODO: rm below?
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
