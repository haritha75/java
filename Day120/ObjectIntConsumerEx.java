import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
 //it is functional interface.
 //it takkes two input one is object that means it takes any type but second one is primitive type what we mentioning in the interface that type takes.
public class ObjectIntConsumerEx {
    public static void main(String[] args) {
        
        ObjIntConsumer<String> objIntConsumer = (n1,n2) -> System.out.println(n1+n2);

        objIntConsumer.accept("haritha", 97); //first argument accept any type tha means what type mentioning in the object that will take and second one must be int because we mention intconsumer.

        ObjDoubleConsumer<Integer> objDoubleConsumer1 = (n1,n2) -> System.out.println(n1+n2);

        objDoubleConsumer1.accept(87, 975.4);

        ObjLongConsumer<Double> objLongConsumer2 = (n1,n2) -> System.out.println(n1+n2*56);

        objLongConsumer2.accept(45.6, 8764);
    }
    
}
