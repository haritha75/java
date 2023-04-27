import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {
        
        System.out.println(LocalTime.now()); //now is a static function.

        LocalTime time = LocalTime.now();//same above like localtime is class create object and print that object.
        
        System.out.println(time);
    }
    
}
