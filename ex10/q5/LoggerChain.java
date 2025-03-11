public class LoggerChain {
    public static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);
        Logger fileLogger = new FileLogger(LogLevel.DEBUG);
        Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);

        // chain order
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger; //highest order
    }
}
