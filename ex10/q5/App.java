public class App {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getChainOfLoggers();

        System.out.println("------ Logging at INFO level ------");
        loggerChain.logMessage(LogLevel.INFO, "This is an information.");

        System.out.println("\n------ Logging at DEBUG level ------");
        loggerChain.logMessage(LogLevel.DEBUG, "This is a debug information.");

        System.out.println("\n------ Logging at ERROR level ------");
        loggerChain.logMessage(LogLevel.ERROR, "This is an error information.");
    }
}
