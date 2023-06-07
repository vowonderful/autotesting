package Drivers;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverOptions implements DriverOptions {
    private final ChromeOptions options;

    public ChromeDriverOptions() {
        this.options = new ChromeOptions();
    }

    @Override
    public void addArguments(String... arguments) {
        options.addArguments(arguments);
    }

    public ChromeOptions getOptions() {
        return options;
    }
}
