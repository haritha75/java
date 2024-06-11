import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
//map method is used to whatever you mention reference object in map based on the reference object it will return the result.
//use d to return stream consisting of the results of applying the given function to the elements of his stream.that means whatever override the applying method that result will be returns.
public class MapMethodExample {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(200,400,600,80,323,1000);

        Stream<Integer> stream = data.stream(); 

        Function<Integer,Integer> function = new Function<Integer,Integer>() { //function is a functional interface.we can override the apply method in function.
            @Override
            public Integer apply(Integer integer) { //it is a anonymous class.
                return integer*1000; //mention what you want.

            }
        };
        Stream<Integer> integerStream = stream.map(function); //in map method whatever we mention in override method that result will be return.
        integerStream.forEach(n -> System.out.println(n/2)); //here we are iterate the map method values again using lambda expression.
        //integerStream.forEach(System.out::println); //method reference.
        

        
    }
    
}
