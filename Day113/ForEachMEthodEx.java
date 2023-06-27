import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMEthodEx {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(2,4,6,8,3,1);

        Consumer<Integer> consumer = System.out::println; //consumer is a functional interface.here,we can use method reference.

        Consumer<Integer> consumer2 = n -> System.out.println(n); //it is lambda exxpression.
            
        data.forEach(consumer);
        System.out.println();
        
        data.forEach(consumer2);

        data.forEach(System.out::println);//e can use directly like this.
    }
}