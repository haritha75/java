import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapMethod {

    public static void main(String[] args) {
        
        List<String> list = List.of("raj","bhargav","neel");

        Map<String, Integer>  map = list.stream().collect(Collectors.toMap(v1 -> v1 , v2 -> v2.length())); //here it will take String means name that will be the key in map and it calculate string length that will be the value in map.
        
        System.out.println(map); //in map data not stored in sequencial order.
        
    }
    
}
