import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
//it is used for select elements as per the predicate passed as an argument.
public class FilterMethodInStreamAPI {

    public static void main(String[] args) {
        
        List<Integer>  data = Arrays.asList(5,8,2,7,1,4);
        Stream<Integer> stream = data.stream();

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2==0;
            }
        };

        Stream<Integer> list = stream.filter(predicate); //what elements are eligible based on the test method in predicate functional interface that elements are filtered .
        list.forEach(System.out::println);


    }
    
}
