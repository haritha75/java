import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingEx {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(LoggingEx.class.getName());

        logger.setLevel(Level.SEVERE);
        logger.info("general information");
        logger.severe("It's serious");
    }
}