import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//it is used arrange the elements in order wise.
//it is a intermediate operations.
public class SortedMethod {

    public static void main(String[] args) {
        

        List<Integer>  data = Arrays.asList(5,8,2,7,1,4);
        Stream<Integer> stream = data.stream();

        Stream<Integer> list = stream.map(n -> (n*n)).filter(n ->(n%2==0)).sorted(); //here,map the lement and filtering based on the condition in the method and last sorting.

        list.forEach(n -> System.out.println(n));
    }
    
}
