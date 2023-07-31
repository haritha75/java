import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleHandlerInLogging {

    public static void main(String args[]) {
        final Logger logger= Logger.getLogger(ConsoleHandlerInLogging.class.getName());

        logger.warning("this is a warning level");
        logger.info("this is an info level");

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.CONFIG); //ALL
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.CONFIG); //OFF
        logger.config("config level");

    }

    
}
