import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//it is used to reduce the elements of a stream to a single value.
//it takes binary operator as a parameter.
//it is a terminal operator means use this mehtod at last.
public class ReduceMethodInStreamAPI {

    public static void main(String[] args) {


        List<Integer>  data = Arrays.asList(5,8,2,7,1,4);
        Stream<Integer> stream = data.stream();

        Integer s = stream.map(n -> (n*n)).reduce(0, (ans,i) -> ans+i);
        System.out.println(s);



    }
    
}
