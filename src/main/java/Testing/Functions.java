package Testing;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Functions {
    public String getCurrentDateTimeInfo(@NotNull String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat();

        switch (format.toLowerCase()) {
            default:
            case "datetime":
            case "dd.mm.yyyy hh:mm:ss":
            {
                dateFormat.applyPattern("dd.MM.yyyy HH:mm:ss");
                break;
            }
            case "date":
            case "dd.mm.yyyy":
            {
                dateFormat.applyPattern("dd.MM.yyyy");
                break;
            }
            case "time":
            case "hh:mm:ss":
            {
                dateFormat.applyPattern("HH:mm:ss");
                break;
            }
            case "yyyy.mm.dd":
            {
                dateFormat.applyPattern("yyyy.MM.dd");
                break;
            }
            case "date-log":
            case "yyyy-mm-dd":
            {
                dateFormat.applyPattern("yyyy-MM-dd");
                break;
            }
            case "datetime-log":
            case "yyyy-mm-dd hh:mm:ss":
            {
                dateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
                break;
            }
        }

        return dateFormat.format(new Date());
    }

    public String getLogTime() {
        return "[" + getCurrentDateTimeInfo("datetime") + "] ";
    }

    public void toWait(int milliseconds) {
        Logger.log("Wait " + milliseconds + " milliseconds.");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void toWait() {
        int defaultWaitTime = 1575; // default time
        Logger.log("Wait " + defaultWaitTime + " milliseconds.");
        try {
            Thread.sleep(defaultWaitTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getRandom(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }
}
