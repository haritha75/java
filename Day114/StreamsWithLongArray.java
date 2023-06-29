import java.util.Arrays;
import java.util.stream.LongStream;

//we have three type of streams in primitive datatype that are int,long and double.

public class StreamsWithLongArray {

    public static void main(String[] args) {
        

        long a1[]={40,6,8,2,5};
        LongStream d = Arrays.stream(a1);
        d.forEach(n -> System.out.println(n));
        

        long a[]= {3,6,8,1,5,22,56,74};
        LongStream stream = Arrays.stream(a,1,8); //like this int array data converting into the streams.
        stream.forEach(n -> System.out.println(n));
    }
    
}
