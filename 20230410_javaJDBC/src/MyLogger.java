import java.util.logging.Logger;

public class MyLogger {
    private static final Logger classALogger = Logger.getLogger("App");
    private static final Logger classBLogger = Logger.getLogger("DbConnection");

    // Configure the logger
    static {
        // Add handlers, set logging level, etc.
        // ...
    }

    // Getter methods for the loggers
    public static Logger getClassALogger() {
        return classALogger;
    }

    public static Logger getClassBLogger() {
        return classBLogger;
    }
}