import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//collect method is used to what data in stream that data will be collecting into a list and return it.
//it is a terminal operations means after completing all methods last do this operations.
public class CollectMethodInStreamAPI {

    public static void main(String[] args) {

        List<Integer>  data = Arrays.asList(5,8,2,7,1,4);
        Stream<Integer> stream = data.stream();


        List list = stream.map(n -> n*n).collect(Collectors.toList());
        System.out.println(list);


        
        
    }
    
}
