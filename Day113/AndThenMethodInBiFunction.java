import java.util.function.BiFunction;

public class AndThenMethodInBiFunction {

    public static void main(String[] args) {
        
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a+b;
        
        biFunction= biFunction.andThen(a -> (2*a));
        System.out.println("biFunction "+biFunction.apply(3, 5));
    }
    
}
