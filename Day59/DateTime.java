import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

    public static void main(String[] args) {

        LocalDateTime harithaBornDate = LocalDateTime.of(2001,6,15,9,12,36,111); //combination of time  and date
        LocalDateTime hariBornDate = LocalDateTime.of(2005,9,14,3,12,36,131);
        System.out.println(harithaBornDate);
        System.out.println(hariBornDate);
        var res = harithaBornDate.isBefore(hariBornDate); // comparing two born date who is first and then next.
        System.out.println(res);
        LocalDate n = LocalDate.now();
        System.out.println(n);
        LocalDate v = LocalDate.of(2001,6,15); // it contains only date
        LocalTime c = LocalTime.of(9,12,36,111); //only time
        System.out.println(v);
        System.out.println(c);


    }
}
