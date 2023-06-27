import java.util.function.BiFunction;

//bifunction is a functional interface in this interface we have apply method also.
public class BiFunctionExample {

    public static void main(String[] args) {
        
        BiFunction<Integer,Integer,Integer> biFunction = new BiFunction<Integer,Integer,Integer>() { //anonymous class.
            @Override
            public Integer apply(Integer integer,Integer integer1) {

                return integer*integer1/2;

            }
        };

        Integer x = biFunction.apply(80,15);

        System.out.println(x);
    }

}