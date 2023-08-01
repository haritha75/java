import java.util.logging.Level;
import java.util.logging.Logger;

//here, first logger send the data to the console and console default level is info level.
public class LoggingEx {
    public static void main(String args[]) {

        final Logger logger=Logger.getLogger("Hostel");

        logger.log(Level.SEVERE,"severe level bug encountered");
        logger.severe("severe level");
        logger.warning("warning level");
        logger.info("info level");
        logger.config("config level");
        logger.config("fine");
        logger.config("finer");
        logger.config("finest");



    }
    
}
