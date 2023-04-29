import java.time.LocalDateTime;

public class Timings {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now().getDayOfMonth()); //which day in month
        System.out.println(LocalDateTime.now().toLocalTime()); //present time
        System.out.println(LocalDateTime.now().getDayOfWeek()); // which week day
        System.out.println(LocalDateTime.now().getMinute());
        System.out.println(LocalDateTime.now().getMonthValue());
        System.out.println(LocalDateTime.now().getHour());
        System.out.println(LocalDateTime.now().getNano());
        System.out.println(LocalDateTime.now().getSecond());
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().hashCode());
    }
}
