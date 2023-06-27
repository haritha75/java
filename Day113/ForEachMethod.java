import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//forEachMethod is used to iterate the elements.It is defined in iterable and stream interface.
//It is a default method defined in the iterable interface.Collection classes which extends iterable interface can use forEach loop to iteratuve elements.
//It takes single parameter which isa functional interface.so, you can pass lambda expressions as an argument.

public class ForEachMethod {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(2,4,6,8,3,1);

        Consumer<Integer> consumer = new Consumer<Integer>() { //consumer is a functional interface.we can override the accept method in consumer.
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);

            }
        };
        data.forEach(consumer);
        
        
    }
}