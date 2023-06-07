package Testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static final String LOG_DIRECTORY = "logs";
    private static final String LOG_FILE_EXTENSION = ".log";
    private static final Functions f = new Functions();

    public static void log(String message) {
        if (!Config.LOGGER) return;
        if (Config.LOGGING_TO_CONSOLE) {
            loggingToConsole(message);
        }
        if (Config.LOGGING_TO_FILE) {
            loggingToFile(message);
        }
    }

    public static void loggingToConsole(String message) {
        System.out.println("\u001B[34m" + f.getLogTime() + "\u001B[33m" + message + "\u001B[0m");
    }

    public static void loggingToFile(String message) {
        try {

            File logDirectory = new File(LOG_DIRECTORY);
            if (!logDirectory.exists()) {
                logDirectory.mkdir();
            }

            String logFileName = f.getCurrentDateTimeInfo("date-log") + LOG_FILE_EXTENSION;

            File logFile = new File(LOG_DIRECTORY + File.separator + logFileName);
            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(logFile, true);
            fileWriter.write(f.getLogTime() + message + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}