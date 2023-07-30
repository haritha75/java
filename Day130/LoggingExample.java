import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    public static void main(String[] args) {
      Logger logger = Logger.getLogger("Warden");

      boolean student = true;
      if(!student) {
          logger.log(Level.INFO,"student is  there");

      }
      else {
          boolean student1 = false;
          if (student1) {
              logger.log(Level.WARNING, "student is there ,but it's okay");
          } else {
              logger.log(Level.SEVERE, "student is  not there");

          }
      }
    }
}