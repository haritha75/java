import java.util.Calendar;

public class Time11 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current  Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
    }
}
