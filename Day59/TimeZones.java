import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {

    public static void main(String[] args) {

        for(String zones: ZoneId.getAvailableZoneIds())
            System.out.println(zones);

        System.out.println(LocalDateTime.now(ZoneId.of("Australia/Lindeman"))); //it nothing present time and date in australia.
        System.out.println(LocalDateTime.now()); //it is for humans.
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now()); //it is for computing.

    }
}
