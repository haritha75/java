import java.util.stream.IntStream;

public class IterateMethodInStreams {

    public static void main(String[] args) {

        IntStream intStream = IntStream.iterate(1, i -> i+1).limit(20); //it means it iterate from value 1 to 20 values based on the condition it return the result.
        intStream.forEach(n -> System.out.println(n));
        
    }
    
}
