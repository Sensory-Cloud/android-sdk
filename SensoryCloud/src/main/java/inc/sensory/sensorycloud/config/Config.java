package inc.sensory.sensorycloud.config;

public class Config {

    public static class CloudConfig {
        public String host;

        public CloudConfig(String host) {
            this.host = host;
        }
    }

    public static class TenantConfig {
        public String tenantId;

        public TenantConfig(String tenantId) {
            this.tenantId = tenantId;
        }
    }

    public static class DeviceConfig {
        public String deviceId;
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
