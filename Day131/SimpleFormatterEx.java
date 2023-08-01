
    import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SimpleFormatterEx {

     public static void main(String args[]) throws SecurityException, IOException {

        final Logger logger=Logger.getLogger("Hostel");
        
        FileHandler file = new FileHandler("file3.log",true); //if you do not want previous data make false if you want previous data in that file then make true.
        file.setLevel(Level.ALL);
        file.setFormatter(new SimpleFormatter());

        logger.setUseParentHandlers(false); // it is used if parent level data do not want that time make false.then it will not print that data.

        logger.addHandler(file);
        logger.setLevel(Level.FINEST); //here whatever we set the level in above same here also set same level.and also in console it print two type becuase again we are addingdata to the console here second time that's why ti print two types.
        logger.severe("severe level");
        logger.warning("warning level");
        logger.info("info level");
        logger.config("config level");

        logger.setLevel(Level.SEVERE);
        logger.config("fine");
        logger.config("finer");
        logger.config("finest");



    }

    
}

    

