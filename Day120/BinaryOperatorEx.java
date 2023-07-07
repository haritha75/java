import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.LongBinaryOperator;
//it takes two values as a input returns same data type as a result.
public class BinaryOperatorEx {
    public static void main(String[] args) {
        
        BinaryOperator<Integer> binaryOperator = (n1,n2) -> n1+n2;
        System.out.println(binaryOperator.apply(5, 7));

        DoubleBinaryOperator d = (n1,n2) -> n1+n2; //it means ninary operator takes two inputs and returns double data type.

        System.out.println(d.applyAsDouble(56,87));


        LongBinaryOperator l = (n2,n3) -> n2*n3+n3;

        System.out.println(l.applyAsLong(567, 745));
    }
    
}
