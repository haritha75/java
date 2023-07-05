import java.util.HashMap;
import java.util.Map;
//map is combination of key and value pair.
//it does not allows duplicate keys.
//for searching key it will take time complexity O(1). because it have index exact keys stored that index whenever search a key  directly it will go to that index only.
//for searching value it will take time complexity O(n).because it oes not have index so that's why it will check for intially level.that 's why it takes O(n).
//it  print the keys in ascending order.
public class HashMapClassEx {
    public static void main(String[] args) {
        

        Map<Integer,Integer> map = new HashMap<>();

        map.put(2,5);
        map.put(1,8);
        map.put(2,9); //map does not accepts duplicates keys.
        map.put(3,7);
        System.out.println(map);

    }
}
