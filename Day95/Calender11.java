import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

//calendar class in java is an abstract class that provides methods for converting data between a specific instant in time and  set the calender fields such that month,year,month.
public class Calender11 {

    public static void main(String[] args) {
        System.out.println(Calendar.JANUARY); //month start from 0.
        System.out.println(Calendar.WEDNESDAY); //day start from sunday  number us 1.

        Calendar calendar = Calendar.getInstance(); //this method gives time,day,hour,month,millisecond etc.
        System.out.println(calendar.getTime()); //it gives time only

        Calendar calendar1 = Calendar.getInstance(Locale.FRANCE); //if you want particular country time mention like this.
        System.out.println(calendar1.getTime());

        Locale locale[] = Calendar.getAvailableLocales(); //it is an array contain allinstalled locales.

        for(var x:locale)
            System.out.println(x);

        System.out.println(Calendar.getInstance(Locale.CANADA).getTime());

        TimeZone tz = TimeZone.getTimeZone("America/Los_Angles");

        Calendar c = Calendar.getInstance(tz);
        System.out.println(c);


    }
}
