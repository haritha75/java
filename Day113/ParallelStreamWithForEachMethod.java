import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
//in parallelstream with foreach method it iterate the  data in randomly not sequentially.
public class ParallelStreamWithForEachMethod {
    public static void main(String[] args) {
        
        List<Integer> data = Arrays.asList(2,4,6,8,3,1);

        Stream<Integer> stream = data.parallelStream(); //.parallelstream() means data converting into the streams and stored in one variable reference.
        stream.forEach(n -> System.out.println(n)); //we can iterate the stream data using forEach Method.

        


    }
    
}
