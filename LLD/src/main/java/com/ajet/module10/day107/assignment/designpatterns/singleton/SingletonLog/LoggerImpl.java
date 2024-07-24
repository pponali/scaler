package com.ajet.module10.day107.assignment.designpatterns.singleton.SingletonLog;

/**
 *
 * Author prakashponali @pponali
 * <p>
 * Date   22/07/24 4:21 pm
 */



import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;

/**
 * LoggerImpl is a implementation class for logger.
 */
public class LoggerImpl implements Logger {

    private FileWriter logFile;
    private String logFilePath;
    private boolean isInitialized = false;

    private static volatile LoggerImpl instance = null;

    private LoggerImpl(){}

    /**
     * This method is responsible for logging a message with a specified log level.
     * The log message should include a timestamp, log level, and the provided message.
     * Throw an IllegalStateException if the logger is not initialised using the setLogFile() method.
     * <p>
     * Hint: Use the java.time.LocalDateTime class to get the current timestamp.
     *
     * @param level - level
     *
     * @param message - message
     *
     */
    @Override
    public void log(Level level, String message) {
        if (!isInitialized) {
            throw new IllegalStateException("Logger not initialized. Call setLogFile() first.");
        }
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        String logEntry = String.format("%s [%s] %s%n", timestamp, level, message);

        try {
            logFile.write(logEntry);
            flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * This method returns the current log file path.
     *
     * @param filePath - filePath
     */
    @Override
    public void setLogFile(String filePath) {
        try {
            logFile = new FileWriter(filePath, true);
            logFilePath = filePath;
            isInitialized = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is responsible for logging a message with a specified log level.
     * The log message should include a timestamp, log level, and the provided message.
     * Throw an IllegalStateException if the logger is not initialised using the setLogFile() method.
     *
     * @return
     */
    @Override
    public String getLogFile() {
        if (isInitialized) {
            return logFilePath;
        } else
            throw new IllegalStateException("Logger not initialized. Call setLogFile() first.");
    }

    /**
     * This method flushes any buffered log entries to the log file.
     * Find the appropriate method to use from the java.io.PrintWriter class.
     */
    @Override
    public void flush() {
        if (isInitialized) {
            try {
                logFile.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            throw new IllegalStateException("Logger not initialized. Call setLogFile() first.");
    }

    /**
     * This method closes the logger and releases any resources.
     * Find the appropriate method to use from the java.io.PrintWriter class.
     * <p>
     * Hint: Use a try-with-resources statement to ensure proper resource cleanup.
     *
     */
    @Override
    public void close() {
        if (isInitialized) {
            try {
                logFile.close();
                isInitialized = false; // Invalidate the logger after closing
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            throw new IllegalStateException("Logger not initialized. Call setLogFile() first.");
    }

    /**
     * Implement the Singleton design pattern: Within your logger class,
     * implement the Singleton design pattern to ensure
     * that only one instance of your class can exist within the program.
     * <p>
     * Hint: Use a synchronized block to ensure thread safety during instance creation.
     * <p>
     * Hint: Use a volatile keyword to ensure proper visibility of the instance across multiple threads.
     * @return
     */
    public static Logger getInstance() {
        if(instance == null){
            synchronized (LoggerImpl.class){
                if(instance == null){
                    instance = new LoggerImpl();
                }
            }
        }
        return instance;
    }


    /**
     * This method resets the singleton instance of the logger class to null.
     * This method is used for testing purposes only.
     * <p>
     *     Hint: Set the instance variable to null.
     */
    public static void resetInstance() {
        instance = null;
    }
}
