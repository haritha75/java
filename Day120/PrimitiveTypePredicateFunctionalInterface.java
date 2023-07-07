import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
 //Predicate is functional interface it takes any data type.it check whether  condtion true or not based on the data type or value.it return boolean value.
//but here takes only primitive data types only.
public class PrimitiveTypePredicateFunctionalInterface {

    public static void main(String[] args) {
        

        IntPredicate intPredicate = n -> n >10;
        System.out.println(intPredicate.test(56));

        DoublePredicate doublePredicate = n -> n%50==0;
        System.out.println(doublePredicate.test(76.456));

        LongPredicate longPredicate = n -> n%3==0;
        System.out.println(longPredicate.test(12357789));
    }
    
}
