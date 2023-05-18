import java.util.HashMap;
public class HashMapFun {

    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"green");
        map.put(2,"black");
        map.put(3,"pink");
        map.put(4,"purple");
        map.put(5,"red");
        map.put(6,"yellow");

        System.out.println(map);
        System.out.println(map.size()); //it returns the size of the hashmap.
        System.out.println(map.get(3)); //it is used getting value from the hashmap with the help of key.
        System.out.println(map.containsKey(5)); // checking given key is avaible or not in hashmap.
        System.out.println(map.containsValue("red")); //checking given value avaible or not in hashmap.
        System.out.println(map.keySet()); //it return all keys from the hashmap.
        System.out.println(map.values()); //it renturns alls values from the hashmap.
        System.out.println(map.entrySet()); //it returns the both key and value pairs.
        System.out.println(map.remove(2)); //it remove both key-value from hashmap.
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.getClass());
        map.clear();
        System.out.println(map); //it returns empty hashmap means it clear all the data.


    }
    
}
