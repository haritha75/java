import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
//map method is used to whatever you mention reference object in map based on the reference object it will return the result.
public class MapMethod {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(2,4,6,8,3,1);

        Stream<Integer> stream = data.stream(); 

        Function<Integer,Integer> function = new Function<Integer,Integer>() { //function is a functional interface.we can override the apply method in function.
            @Override
            public Integer apply(Integer integer) { //it is a anonymous class.
                return integer; //mention what you want.

            }
        };
        Stream<Integer> integerStream = stream.map(function); //in map method whatever we mention in override method that result will be return.
        integerStream.forEach(n -> System.out.println(n)); //here we are iterate the map method values again using lambda expression.
        //integerStream.forEach(System.out::println); //method reference.
        

        
    }
    
}
