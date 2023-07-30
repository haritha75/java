import java.util.logging.Level;
import java.util.logging.Logger;

public class Hostel {
    public static void main(String[] args) {
     final Logger logger = Logger.getLogger(Hostel.class.getName());

      boolean student = false;
      if(student) {
          logger.log(Level.INFO,"student is there");

      }
      else {
          boolean student1 = false;
          if (student1) {
              logger.log(Level.WARNING, "student is there ,but it's okay");
          } else {
              logger.log(Level.SEVERE, "student is  not there");
             // logger.severe("Student is not there"); use like this also direct method it saves some time.

          }
      }

      Hostel2 hostel2 = new Hostel2();
      hostel2.getLOgInfo();
    }
}

class Hostel2 {
    
    String name = "raj";

    private final Logger logger = Logger.getLogger(Hostel2.class.getName());

    void getLOgInfo() {
        if(name.equalsIgnoreCase("Raj")) {
            logger.log(Level.SEVERE,"he may be in danger");
        }
        else {
            logger.log(Level.INFO,"he is in hostel");
        }

    }
}