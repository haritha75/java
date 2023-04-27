import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {

    public static void main(String[] args) {
        
        LocalTime time = LocalTime.now();

        LocalDate date = LocalDate.now();
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/YYYY"); //your choice first want to you want set that format like "MM/DD/YYYY".
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("E dd MMM YY");


        System.out.println("time now"+time);
        System.out.println("date now"+date);
        System.out.println(datetime);
        System.out.println(datetime.format(d));
        System.out.println(datetime.format(d1));

    }
    
}
