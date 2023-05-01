
import java.time.LocalDate;

public class YearPassed {
    
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate previousDate = LocalDate.of(1950,10, 20);

        int years = today.getYear()- previousDate.getYear();

        System.out.println(years);

    }
}