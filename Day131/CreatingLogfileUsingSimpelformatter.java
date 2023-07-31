
    import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CreatingLogfileUsingSimpelformatter {

    public static void main(String args[]) throws SecurityException, IOException {

        final Logger logger=Logger.getLogger("hostel");

        FileHandler file = new FileHandler("data2.log",true); //true means whenever adding new one previous one not removed from the file. for the purpose we are using true here.
        file.setLevel(Level.INFO);
        file.setFormatter(new SimpleFormatter());
        

        logger.addHandler(file);
        logger.setLevel(Level.FINEST);
        logger.config("file configuration done successfully");

        if(true) {
            logger.setLevel(Level.INFO);
            logger.info("general info");
        }
    }
    
}

    

