import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandlerExample {

    public static void main(String args[]) throws SecurityException, IOException {

        final Logger logger=Logger.getLogger(FileHandlerExample.class.getName());

        FileHandler file = new FileHandler("data.log",true);
        file.setLevel(Level.CONFIG);

        logger.addHandler(file);
        logger.setLevel(Level.CONFIG);
        logger.config("file configuration done successfully");
    }
    
}
