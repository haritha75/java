import java.util.function.BiFunction;

public class BiFunctionExample1 {

    public static void main(String[] args) {
        
        BiFunction<Integer,Integer,Integer> biFunction = (n1,n2) -> (n1+n2);

        Integer x = biFunction.apply(80,15);

        System.out.println(x);
    }
    
}
