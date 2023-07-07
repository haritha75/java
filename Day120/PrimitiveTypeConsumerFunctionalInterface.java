import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveTypeConsumerFunctionalInterface {
//it is a primitive type functional interface it is also works as a non-primitive functional interface but differnce is here only accept int but non-primitive it accept all data type.
    public static void main(String[] args) {
        
        IntConsumer intConsumer = n -> System.out.println(n);
        intConsumer.accept(40);


        DoubleConsumer doubleConsumer = n -> System.out.println(n+20);
        doubleConsumer.accept(45.7);

        LongConsumer longConsumer =  n -> System.out.println(n+235678);

        longConsumer.accept(87654);
    }
    
}
