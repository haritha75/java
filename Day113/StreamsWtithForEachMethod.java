import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsWtithForEachMethod {
    public static void main(String[] args) {
        
        List<Integer> data = Arrays.asList(2,5,8,4,1,7,9);

        Consumer<Integer> consumer2 = n -> System.out.println(n*n); //it is lambda exxpression.
            
        data.forEach(consumer2);

        Stream<Integer> stream = data.stream(); //whenever .stream() data converting into streams.but in stream you can read only one .once read it will removed from the stream.
       
        stream.forEach(n -> System.out.println(n*n)); //lambda expressions.

        //stream.forEach(System.out::println);//it is a method reference.in above we already read once so here shows error because their is no data in streams.once data read in stream it will removed.



    }
}
