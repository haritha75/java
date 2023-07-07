import java.util.function.Function;
//it is functional interface
//it takes any data type
//and also returns any data type.
public class FunctionFunctionalInterface {
    public static void main(String[] args) {
         //here we are takes character and return integer type.
        Function<Character,Integer> function =  n ->n+20; //whenever do the operations on character it returns ascill values.
        System.out.println(function.apply('b'));
    }
    
}
