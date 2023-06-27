import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ParallelStreamWithForEachOrderedMethodUsingAnonymousClass {
    
    public static void main(String[] args) {
        

        List<Integer> data = Arrays.asList(2,4,6,8,3,1);
        Stream<Integer> stream = data.parallelStream(); 

        Consumer<Integer> consumer = new Consumer<Integer>() { //consumer is a functional interface.we can override the accept method in consumer.
            @Override
            public void accept(Integer integer) { //it is a anonymous class.
                System.out.println(integer);

            }
        };
        stream.forEach(consumer);
        

        
    }
}