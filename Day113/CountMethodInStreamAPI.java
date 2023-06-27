import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//it is used to  count the how many elements in the streams.
public class CountMethodInStreamAPI {

    public static void main(String[] args) {
        
        List<Integer>  data = Arrays.asList(5,8,2,7,1,4);

        Stream<Integer> stream = data.stream();

        long count = stream.map(n -> n*n).count();
        System.out.println(count);


    }
    
}
