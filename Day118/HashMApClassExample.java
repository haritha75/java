import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMApClassExample {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.age = 11;
        a.name = "Cow";

        Animal a1 = new Animal();
        a1.age =5;
        a1.name = "deer";

        List<Animal> list = List.of(a,a1);


        Map<Integer,List<Animal>> map = new HashMap<>();
        map.put(2,list);
        map.put(4,list);
        
        System.out.println(map);
        System.out.println(map.get(4).get(0).name); //first get method for getting value in hashmap and second get method for index number in values.
        System.out.println(map.get(2));
        System.out.println(map.get(2).get(1));
        


    }
    
}
class Animal {

    int age;
    String name;


    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + "]";
    }
   
    
}