import java.util.Calendar;

public class AddMethodInCalender {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -10);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 7);
        System.out.println("4 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 9);
        System.out.println("2 years later: " + calendar.getTime());
    }
    }

