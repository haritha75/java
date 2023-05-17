
//hashtable is old one so we are using hash map.
//it contains keys and values.
//it does not contain duplicates if you want to duplicates we can use through the array.
import java.util.*;
public class HashMap11 {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(2,"haritha"); //first one is key and second one is value.
        map.put(4,"reddy");
        map.put(6,"harika");

        System.out.println(map);
        System.out.println(map.get(7)); //it does not key it returns null value.
        System.out.println(map.get(4)); //use only key not value.
        System.out.println(map.containsKey(5)); //it return key alue contaning or not.
        System.out.println(map.containsValue("harika"));
        map.put(4,"ramya"); //whenever adding into the value with same key that time it will update the value previous value removed.
        System.out.println(map);
        
    }
}