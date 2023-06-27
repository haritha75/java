import java.util.Arrays;
import java.util.List;
//compared streams parallelstream fast.
public class StremVsParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 2,6,9,3,5,77,44,36,90,99);

        long start = System.currentTimeMillis();

        list.stream().forEach(System.out::println);

        long end = System.currentTimeMillis();

        System.out.println("Stream Time: " + (end - start) + "ms");

        long start1 = System.currentTimeMillis();

        list.parallelStream().forEach(System.out::println);

        long end1 = System.currentTimeMillis();

        System.out.println("Parallel Stream Time: " + (end1 - start1) + "ms");
    }
}