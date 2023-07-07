import java.util.function.UnaryOperator;
//it is functional iterface
//it takes any data type but it return as a result same data type only.
//uniary means only one type it accept and return same data type.
public class UnaryOperatorFunctionalInterface {

    public static void main(String[] args) {
        
        UnaryOperator<Integer> unaryOperator = n -> n+20;
        System.out.println(unaryOperator.apply(10));
    }
    
}
