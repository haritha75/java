import java.util.HashSet;
import java.util.Set;
//it contains only keys an does not allows duplicate keys.
//it takes complexity is O(1).because it stored keys based on the exact indexs wise.
//it store the keys in ascending order.
public class HashSetclass {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(1);
        set.add(5);
        System.out.println(set);
        int count =0;

        
    }
    
}
