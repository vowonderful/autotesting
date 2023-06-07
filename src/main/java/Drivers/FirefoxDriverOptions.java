package Drivers;

import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverOptions implements DriverOptions {
    private final FirefoxOptions options;

    public FirefoxDriverOptions() {
        this.options = new FirefoxOptions();
    }

    @Override
    public void addArguments(String... arguments) {
        options.addArguments(arguments);
    }

    public FirefoxOptions getOptions() {
        return options;
    }
}
