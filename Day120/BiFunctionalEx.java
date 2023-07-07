import java.util.function.BiFunction;
//bi means two so it takes two inputs and function interface returns any time.
public class BiFunctionalEx {

    public static void main(String[] args) {
        //here we are takes two string inputs and it returns double values.
        BiFunction<String,String,Double> biFunction = (n1,n2) -> Double.parseDouble(n1) + Double.parseDouble(n2);
        System.out.println(biFunction.apply("45", "4"));
    }
    
}
