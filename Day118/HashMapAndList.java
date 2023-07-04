import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapAndList {

    public static void main(String[] args) {
        
        List<String> list = List.of("Change","the","palnet");
        List<String> list1 = List.of("Focus","React","Consistenccy");


        Map<Integer,List<String>> map = new HashMap<>();

        map.put(1,list);
        map.put(2,list1);
        map.put(3,list);
        System.out.println(map); //hashmap does not allow duplicate keys but it allows duplicate values.


    }
    
}
