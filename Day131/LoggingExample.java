import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger(LoggingExample.class.getName());

        logger.setLevel(Level.CONFIG);
        logger.log(Level.SEVERE,"severe message");
        logger.severe("server message");
        logger.info("general info");
        
    }
}