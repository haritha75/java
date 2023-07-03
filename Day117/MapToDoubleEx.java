import java.util.Arrays;
import java.util.List;

//it is a intermediate operation.
//it returns Intstream consisiting of the results of applying the given function to the elements of this stream.

public class MapToDoubleEx {
    public static void main(String[] args) {

    


        List<String> list =  Arrays.asList("3","6","8","14","15");

        list.stream().mapToDouble(n -> Double.parseDouble(n)).filter(n -> n%3==0).forEach(n -> System.out.println(n));
    }
}
 