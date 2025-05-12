package utils;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
 
public class LoggerHandler {
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);
    static{
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFileName = "logs/logfile_"+timestamp+".log";
            FileAppender fileAppender = new FileAppender(new PatternLayout("%d{ISO8601} %-5p %c - %m%n "),logFileName,true);
            logger.addAppender(fileAppender);
        } catch (Exception e) {
        }
    }
    /*
    * a. Method Name: trace
    * b. Author Name: Vansh Vijay
    * c. Description: This method logs trace-level messages using the logger.
    * d. Return Type: void
    * e. Parameters: String message;
    */
    public static void trace (String message) {
        logger.trace(message);
    }
    /*
    * a. Method Name: debug
    * b. Author Name: Vansh Vijay
    * c. Description: This method logs debug-level messages using the logger.
    * d. Return Type: void
    * e. Parameters: String message;
    */
    public static void debug (String message) {
        logger.debug(message);
    }
    /*
    * a. Method Name: info
    * b. Author Name: Vansh Vijay
    * c. Description: This method logs info-level messages using the logger.
    * d. Return Type: void
    * e. Parameters: String message;
    */
    public static void info (String message) {
        logger.info(message);
    }
    /*
    * a. Method Name: warn
    * b. Author Name: Vansh Vijay
    * c. Description: This method logs warn-level messages using the logger.
    * d. Return Type: void
    * e. Parameters: String message;
    */
    public static void warn (String message) {
        logger.warn(message);
    }
    /*
    * a. Method Name: error
    * b. Author Name: Vansh Vijay
    * c. Description: This method logs error-level messages using the logger.
    * d. Return Type: void
    * e. Parameters: String message;
    */
    public static void error (String message) {
        logger.error(message);
    }
    /*
    * a. Method Name: fatal
    * b. Author Name: Vansh Vijay
    * c. Description: This method logs fatal-level messages using the logger.
    * d. Return Type: void
    * e. Parameters: String message;
    */
    public static void fatal (String message) {
        logger.fatal(message);
    }
}