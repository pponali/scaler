package com.ajet.module10.day107.designpatterns.singleton.assignment.SingletonLog;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   22/07/24 3:26 pm
 */


import java.util.logging.Level;

public interface Logger {

    void log(Level level, String message);

    void setLogFile(String filePath);

    String getLogFile();

    // Flush the log entries to the file
    void flush();

    // Close the logger and release any resources
    void close();
}
