package Testing;

import java.util.ArrayList;

public class Config {
    public static boolean DO_REAL_TESTS = true; // Выполнять ли тесты?
    public static boolean HEADLESS_MODE = true; // Запустить в фоновом режиме?

    public static boolean LOGGER = true;
    public static boolean LOGGING_TO_FILE = true;
    public static boolean LOGGING_TO_CONSOLE = true;

    public static String Website = "https://itexus.com";
    public static String okPage = "/contacts/thank-you/";

    public static String FormName = "AutoTest";
    public static String FormEmail = "itexus.minsk@gmail.com";
    public static String FormMessage = "This is the text of a test message for contact forms sent using autotests. Made with love for the Itexus project!";
    public static String FormCompany = "Itexus";
    public static String FormPosition = "Fullstack Overflow Developer";
    public static String FormPhone = "+375000000000";

    public static int waitTime = 1575;

    public static boolean isCheckVacancies = true;

    public static boolean useChromeBrowser = true;
    public static boolean useFirefoxBrowser = false;
    public static boolean useEdgeBrowser = false;
    public static boolean useSafariBrowser = false;

    public static boolean useDesktopDevice = true;
    public static boolean useDesktopRotateDevice = false;
    public static boolean useLaptopDevice = false;
    public static boolean useLaptopRotateDevice = false;
    public static boolean useTabletDevice = false;
    public static boolean useTabletRotateDevice = false;
    public static boolean useMobileDevice = false;
    public static boolean useMobileRotateDevice = false;

    public static int[] WINDOW_DESKTOP_SIZE = {1440,1280};
    public static int[] WINDOW_LAPTOP_SIZE = {1280,1024};
    public static int[] WINDOW_TABLET_SIZE = {768,980};
    public static int[] WINDOW_MOBILE_SIZE = {320,575};
    
    public enum checkMethod {
        checkBigContactForm,
        checkCareerForm,
        checkVacancyForm,
        checkSmallContactForm,
        checkPostBannerForm,
        checkPlanningForm,
        checkAllPublicVacancies
    }
    public enum useBrowser {
        CHROME,
        FIREFOX,
        EDGE,
        SAFARI,
    }
    public enum deviceType {
        DESKTOP,
        LAPTOP,
        TABLET,
        MOBILE,
        DESKTOP_LANDSCAPE,
        LAPTOP_LANDSCAPE,
        TABLET_LANDSCAPE,
        MOBILE_LANDSCAPE,
    }

    public static ArrayList<deviceType> devicesList = new ArrayList<>();
    public static ArrayList<useBrowser> browsersList = new ArrayList<>();

    public static deviceType currentDevice;

    public static String chromeDriverPath = "chromedriver";
    public static String firefoxDriverPath = "geckodriver";
    public static String edgeDriverPath = "msedgedriver";
    public static String safariDriverPath = "safaridriver";

    public static void generateListOfUsedDevices() {
        devicesList.clear();
        if (useDesktopDevice) devicesList.add(deviceType.DESKTOP);
        if (useDesktopRotateDevice) devicesList.add(deviceType.DESKTOP_LANDSCAPE);
        if (useLaptopDevice) devicesList.add(deviceType.LAPTOP);
        if (useLaptopRotateDevice) devicesList.add(deviceType.LAPTOP_LANDSCAPE);
        if (useTabletDevice) devicesList.add(deviceType.TABLET);
        if (useTabletRotateDevice) devicesList.add(deviceType.TABLET_LANDSCAPE);
        if (useMobileDevice) devicesList.add(deviceType.MOBILE);
        if (useMobileRotateDevice) devicesList.add(deviceType.MOBILE_LANDSCAPE);
    }

    public static void generateListOfUsedBrowsers() {
        browsersList.clear();
        if (useChromeBrowser) browsersList.add(useBrowser.CHROME);
        if (useFirefoxBrowser) browsersList.add(useBrowser.FIREFOX);
        if (useEdgeBrowser) browsersList.add(useBrowser.EDGE);
        if (useSafariBrowser) browsersList.add(useBrowser.SAFARI);
    }
    
}
