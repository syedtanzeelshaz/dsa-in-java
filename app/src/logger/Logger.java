package logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static LogLevel globalMinLevel = LogLevel.DEBUG;

    private final String className;

    Logger(String className) {
        this.className = className;
    }

    // ── Global config ────────────────────────────────────────────────────────

    /**
     * Set the minimum log level globally (messages below this level are suppressed).
     * Example: Logger.setMinLevel(LogLevel.INFO) suppresses all DEBUG messages.
     */
    public static void setMinLevel(LogLevel level) {
        globalMinLevel = level;
    }

    // ── Logging methods ──────────────────────────────────────────────────────

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(LogLevel.DEBUG, format(format, args));
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void info(String format, Object... args) {
        log(LogLevel.INFO, format(format, args));
    }

    public void warn(String message) {
        log(LogLevel.WARN, message);
    }

    public void warn(String format, Object... args) {
        log(LogLevel.WARN, format(format, args));
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void error(String message, Throwable throwable) {
        log(LogLevel.ERROR, message);
        if (isEnabled(LogLevel.ERROR)) {
            throwable.printStackTrace(System.out);
        }
    }

    public void error(String format, Object... args) {
        log(LogLevel.ERROR, format(format, args));
    }

    // ── Internal ─────────────────────────────────────────────────────────────

    /**
     * Replaces each {} placeholder in the template with the next argument.
     * Extra args are ignored; missing args leave the {} as-is.
     * Example: format("Hello {}, you are {} years old", "Syed", 25)
     *          → "Hello Syed, you are 25 years old"
     */
    private String format(String template, Object... args) {
        if (args == null || args.length == 0) return template;

        StringBuilder sb = new StringBuilder();
        int argIndex = 0;
        int i = 0;

        while (i < template.length()) {
            if (i + 1 < template.length()
                    && template.charAt(i) == '{'
                    && template.charAt(i + 1) == '}') {
                sb.append(argIndex < args.length ? args[argIndex++] : "{}");
                i += 2;
            } else {
                sb.append(template.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }

    private boolean isEnabled(LogLevel level) {
        return level.getSeverity() >= globalMinLevel.getSeverity();
    }

    private void log(LogLevel level, String message) {
        if (!isEnabled(level)) return;

        String timestamp = LocalDateTime.now().format(FORMATTER);
        String output = String.format("[%s] [%s] [%s] %s",
                timestamp, level.name(), className, message);

        System.out.println(output);
    }
}