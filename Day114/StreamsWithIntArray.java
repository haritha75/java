import java.util.Arrays;
import java.util.stream.IntStream;

//we have three type of streams in primitive datatype that are int,long and double.
public class StreamsWithIntArray {
    public static void main(String[] args) {


        int a1[]={40,6,8,2,5};
        IntStream d = Arrays.stream(a1);
        d.forEach(n -> System.out.println(n));
        

        int a[]= {3,6,8,1};
        IntStream stream = Arrays.stream(a,1,4); //like this int array data converting into the streams.
        stream.forEach(n -> System.out.println(n));
    }

}