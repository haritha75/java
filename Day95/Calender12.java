import java.util.Calendar;
import java.util.TimeZone;

public class Calender12 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        String tz_name = c.getTimeZone().getDisplayName();

        TimeZone tz = TimeZone.getTimeZone("Africa/Algiers"); //it returns the timezone

        String ids[] = TimeZone.getAvailableIDs(); //here takes all timezone ids into aa string array

        for(var x:ids)
            System.out.println(x);
        c.setTimeZone(tz);

        System.out.println("modified zone "+c.getTimeZone().getDisplayName());


        TimeZone tz1 = TimeZone.getTimeZone("Africa/Algiers"); //it returns the timezone
        c.setTimeZone(tz1); //here set timezone to the tz1
        System.out.println(c.getTime()); //it returns time



    }
}
