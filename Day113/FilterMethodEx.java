import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMethodEx {
    
    public static void main(String[] args) {

        List<Integer>  data = Arrays.asList(5,8,2,7,1,4);
        Stream<Integer> stream = data.stream();

        Predicate<Integer> predicate = n -> n%2==0;

         Stream<Integer> list = stream.filter(predicate); //what elements are eligible based on the test method in predicate functional interface that elements are filtered .
        list.forEach(System.out::println);

 
        
    }
}
