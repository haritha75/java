import java.util.Arrays;
import java.util.List;

//it is a intermediate operation.
//it returns Intstream consisiting of the results of applying the given function to the elements of this stream.

public class MapToIntMethod {

    public static void main(String[] args) {
        

        List<String> list =  Arrays.asList("3","6","8","14","15");

        list.stream().mapToInt(n -> Integer.parseInt(n)).filter(n -> n%2==0).forEach(n -> System.out.println(n));
    }
}