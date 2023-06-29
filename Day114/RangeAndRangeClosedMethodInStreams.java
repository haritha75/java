import java.util.stream.IntStream;

//range method is used to if you want print 1000 values at a time for that purpose we are using this method.
public class RangeAndRangeClosedMethodInStreams {

    public static void main(String[] args) {
        

        IntStream intStream = IntStream.range(1, 30); //range method with inclusive and exclusive.
        intStream.forEach(n -> System.out.println(n));

        IntStream intStream2 = IntStream.rangeClosed(1, 500); //this method print upto exclusive value.but range not like that.
        intStream2.forEach(n -> System.out.println(n));
    }
    
}
