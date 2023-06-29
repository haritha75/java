import java.util.stream.Stream;

public class WrappeclassDataTypeWithStreams {

    public static void main(String[] args) {
        

        Integer a[]= {3,7,5,10,23,57};
        Stream<Integer> s2 = Stream.of(a); //if you use wrapper class  datatype array then use stream.of method to converting array to streams.
        Stream<Integer> s=  s2.map(n -> n); //mapping all result .
        Stream<Integer> d1 = s.filter(n -> n%2==0); //and based condition it returns the results.

        d1.forEach(n -> System.out.println(n));

       

    }
    
}
