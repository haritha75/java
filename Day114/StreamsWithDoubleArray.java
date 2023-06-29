import java.util.Arrays;
import java.util.stream.DoubleStream;
//we have three type of streams in primitive datatype that are int,long and double.

public class StreamsWithDoubleArray {
    public static void main(String[] args) {


        double a1[]={40,6,8,2,5};
        DoubleStream d = Arrays.stream(a1); //without mentioning inclusive and exclusive.
        d.forEach(n -> System.out.println(n));
        
        

        double a[]= {3.9,6.4,8.6,1.4};
        DoubleStream stream = Arrays.stream(a,0,3); //like this double array data converting into the streams.
        stream.forEach(n -> System.out.println(n));
    }
    
}
