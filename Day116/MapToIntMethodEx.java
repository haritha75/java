import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class MapToIntMethodEx {

    public static void main(String[] args) {
        

        List<String> list = Arrays.asList("haritha","ramya","reddy","harika");

        list.stream().mapToInt(n -> n.length()).forEach(n -> System.out.println(n));
    }
    
}
