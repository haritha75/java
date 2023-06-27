import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//in parallelstream with forEachOrdered method we can iterate the elements in sequentially.if ypu want sequential elements in parallelstreams use this method.
public class ParallelStreamWithForEachOrderedMethodExample {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(2,4,6,8,3,1);

        Stream<Integer> stream = data.parallelStream(); //.parallelstream() means data converting into the streams and stored in one variable reference.
        stream.forEachOrdered(System.out::println); //we can iterate the stream data using forEach Method.

        
    }
    
}
