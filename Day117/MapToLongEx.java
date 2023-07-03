import java.util.Arrays;
import java.util.List;

public class MapToLongEx {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("50","70","20","55","67","34");

        list.stream().mapToLong(name -> Long.parseLong(name)).filter(n -> n%10==0).forEach(n -> System.out.println(n));

    }
    
}
