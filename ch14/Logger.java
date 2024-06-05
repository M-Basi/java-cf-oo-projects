package gr.aueb.excercises.OOP.ch14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger INSTANCE = null;


    private Logger() {

    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }



    public void logMessage(String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.err.println(message +" " + timestamp);
    }
}
