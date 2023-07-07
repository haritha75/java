import java.util.function.DoubleToLongFunction;
import java.util.function.IntToDoubleFunction;
//Functional is  a functional interface it takes any data type and returns any data types .
//here int data is taken and returns double value.
public class IntToDoubleFunctionEx {

public static void main(String[] args) {
    
    IntToDoubleFunction intToDoubleFunction = n -> n+20;
    System.out.println(intToDoubleFunction.applyAsDouble(98));

    

}
    
}
