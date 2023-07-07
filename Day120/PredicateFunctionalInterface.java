import java.util.function.Predicate;
 //Predicate is functional interface it takes any data type.it check whether  condtion true or not based on the data type or value.it return boolean value.
public class PredicateFunctionalInterface {

    public static void main(String[] args) {
        

        Predicate<Integer> predicate = value -> value%10==0;

        System.out.println(predicate.test(25));
            
        
    }
    
}
