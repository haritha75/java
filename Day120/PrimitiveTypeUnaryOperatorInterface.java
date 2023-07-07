import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class PrimitiveTypeUnaryOperatorInterface {

    public static void main(String[] args) {
        

        IntUnaryOperator intUnaryOperator = m -> m;
        System.out.println(intUnaryOperator.applyAsInt(8));

        DoubleUnaryOperator doubleUnaryOperator = m-> m;
        System.out.println(doubleUnaryOperator.applyAsDouble(764.3));


        LongUnaryOperator longUnaryOperator = n -> n;
        System.out.println(longUnaryOperator.applyAsLong(98687));
    }
    
}
