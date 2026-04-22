package logger;

public class LoggerFactory {

    private LoggerFactory() {}

    /**
     * Get a logger for a specific class.
     * Usage: private static final Logger log = LoggerFactory.getLogger(MyClass.class);
     */
    public static Logger getLogger(Class<?> clazz) {
        return new Logger(clazz.getSimpleName());
    }

    /**
     * Get a logger with a custom name.
     * Usage: private static final Logger log = LoggerFactory.getLogger("MyComponent");
     */
    public static Logger getLogger(String name) {
        return new Logger(name);
    }
}
