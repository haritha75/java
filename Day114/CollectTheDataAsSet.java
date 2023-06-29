import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTheDataAsSet {

    public static void main(String[] args) {
        

        Integer data[]= {3,6,8,1,77};
        Stream<Integer>  d = Stream.of(data);

        Set d1 = d.map(n -> n).filter(n -> n%2==0).collect(Collectors.toSet()); //it collect the data stored as a set.
        System.out.println(d1.contains(8));
    }
    
}
