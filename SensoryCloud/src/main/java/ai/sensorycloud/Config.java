package ai.sensorycloud;

import java.util.Locale;

/**
 * Configuration object for setting default values for Sensory Cloud
 */
public class Config {

    protected static SDKInitConfig sharedConfig;

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
    public static String defaultLanguageCode = Locale.getDefault().toString();
}
