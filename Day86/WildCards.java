import java.util.ArrayList;
import java.util.List;
//? means to represent unknown type.
public class WildCards {

    public static void main(String[] args) {

        List<Animal2> list = new ArrayList<>(); //here we are using animal2 type so it allows animal2 class subclasses also.

        Animal2 a1 = new Animal2("cherry");
        list.add(a1);

        Dog d1 = new Dog("teddy");
        list.add(d1);
        print(list);

    }

    public static  void print(List<? extends Animal2> a) { //it allows all animal2 class types means subclasses also.
        System.out.println(a);
    }
}
class Animal2 {

    String name;
    Animal2() {

    }

    Animal2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal2{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Dog extends Animal2 {

    String name;
    Dog() {

    }
    Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog : "+name;
    }


}