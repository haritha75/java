
    import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

//here, first logger send the data to the console and console default level is info level.
public class LoggerExample {
    public static void main(String args[]) {

        final Logger logger=Logger.getLogger("Hostel");

        ConsoleHandler console = new ConsoleHandler();
        console.setLevel(Level.FINEST);

        logger.addHandler(console);
        logger.setLevel(Level.FINEST); //here whatever we set the level in above same here also set same level.and also in console it print two type becuase again we are addingdata to the console here second time that's why ti print two types.
        logger.severe("severe level");
        logger.warning("warning level");
        logger.info("info level");
        logger.config("config level");
        logger.config("fine");
        logger.config("finer");
        logger.config("finest");



    }
    
}

    

