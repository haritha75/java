import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args) {
        
        Map<Integer,Cat> map = new HashMap<>();

        Cat c= new Cat();
        c.age=12;
        c.name ="Lilly";

        Cat c1= new Cat();
        c1.age=22;
        c1.name ="kiddy";

        map.put(10, c);
        map.put(15,c1);
        map.put(10,c1); //it does not allows duplicate key so this key not consider hashmap class.
        System.out.println(map);
        System.out.println(map.get(15)); //based on the key it return value.
        System.out.println(map.get(10).name); 



    }
    
}
class Cat {

    int age;
    String name;

    @Override
    public String toString() {
        return "Cat [age=" + age + ", name=" + name + "]";
    }

}