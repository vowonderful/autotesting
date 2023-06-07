package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static boolean appoint() {
        Logger.log("Reading test configurations from the \"config.properties\" file...");

        Properties properties = new Properties();
        String configFilePath = "config.properties";

        try {
            File file = new File(configFilePath);

            if (!file.exists()) {
                Logger.log("File 'config.properties' not found, exiting method...");
                return false;
            }

            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
            fileInputStream.close();

            Logger.log("Configuration parameters have been read");

        } catch (IOException e) {
            e.printStackTrace();
        }

        Config.DO_REAL_TESTS = Boolean.parseBoolean(properties.getProperty("DO_REAL_TESTS"));

        Config.HEADLESS_MODE = Boolean.parseBoolean(properties.getProperty("HEADLESS_MODE"));

        Config.LOGGER = Boolean.parseBoolean(properties.getProperty("LOGGER"));
        Config.LOGGING_TO_FILE = Boolean.parseBoolean(properties.getProperty("LOGGING_TO_FILE"));
        Config.LOGGING_TO_CONSOLE = Boolean.parseBoolean(properties.getProperty("LOGGING_TO_CONSOLE"));

        Config.Website = properties.getProperty("website");
        Config.okPage = properties.getProperty("okpage");

        Config.FormName = properties.getProperty("FormName");
        Config.FormEmail = properties.getProperty("FormEmail");
        Config.FormMessage = properties.getProperty("FormMessage");
        Config.FormCompany = properties.getProperty("FormCompany");
        Config.FormPosition = properties.getProperty("FormPosition");
        Config.FormPhone = properties.getProperty("FormPhone");

        Config.waitTime = Integer.parseInt(properties.getProperty("waitTime"));

        Config.isCheckVacancies = Boolean.parseBoolean(properties.getProperty("isCheckVacancies"));

        Config.useChromeBrowser = Boolean.parseBoolean(properties.getProperty("useChromeBrowser"));
        Config.useFirefoxBrowser = Boolean.parseBoolean(properties.getProperty("useFirefoxBrowser"));
        Config.useEdgeBrowser = Boolean.parseBoolean(properties.getProperty("useEdgeBrowser"));
        Config.useSafariBrowser = Boolean.parseBoolean(properties.getProperty("useSafariBrowser"));

        Config.useDesktopDevice = Boolean.parseBoolean(properties.getProperty("useDesktopDevice"));
        Config.useDesktopRotateDevice = Boolean.parseBoolean(properties.getProperty("useDesktopRotateDevice"));
        Config.useLaptopDevice = Boolean.parseBoolean(properties.getProperty("useLaptopDevice"));
        Config.useLaptopRotateDevice = Boolean.parseBoolean(properties.getProperty("useLaptopRotateDevice"));
        Config.useTabletDevice = Boolean.parseBoolean(properties.getProperty("useTabletDevice"));
        Config.useTabletRotateDevice = Boolean.parseBoolean(properties.getProperty("useTabletRotateDevice"));
        Config.useMobileDevice = Boolean.parseBoolean(properties.getProperty("useMobileDevice"));
        Config.useMobileRotateDevice = Boolean.parseBoolean(properties.getProperty("useMobileRotateDevice"));

        Config.chromeDriverPath = properties.getProperty("chromedriver");
        Config.firefoxDriverPath = properties.getProperty("firefoxdriver");
        Config.edgeDriverPath = properties.getProperty("safaridriver");
        Config.safariDriverPath = properties.getProperty("edgedriver");

        Logger.log("All test configuration parameters are saved");

        return true;
    }
}