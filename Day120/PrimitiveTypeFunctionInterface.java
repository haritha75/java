import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class PrimitiveTypeFunctionInterface {
    public static void main(String[] args) {

        IntFunction intFunction = n -> n+10.8; //here we take int and return double type.
        System.out.println(intFunction.apply(34));

        DoubleFunction doubleFunction = m ->(int) m+23;
        System.out.println(doubleFunction.apply(34.65));

        LongFunction longFunction = n -> (double) n+34;
        System.out.println(longFunction.apply(436));
        
    }
    
}
