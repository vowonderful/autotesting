package Drivers;

import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverOptions implements DriverOptions {
    private final EdgeOptions options;

    public EdgeDriverOptions() {
        this.options = new EdgeOptions();
    }

    @Override
    public void addArguments(String... arguments) {
        options.addArguments(arguments);
    }

    public EdgeOptions getOptions() {
        return options;
    }
}
