package pl.mamicam.logger;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class ConsoleLogger extends System.LoggerFinder implements System.Logger {
    @Override
    public String getName() {
        return "ConsoleLogger";
    }

    @Override
    public boolean isLoggable(Level level) {
        return true;
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
        System.out.printf("ConsoleLogger [%s]: %s - %s%n", level, msg, thrown);
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {
        System.out.printf("ConsoleLogger [%s]: %s%n", level,
                MessageFormat.format(format, params));
    }

    @Override
    public System.Logger getLogger(String name, Module module) {
        return new ConsoleLogger();
    }
}
