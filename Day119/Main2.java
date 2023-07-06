import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Animal> animal = AnimalData.getAnimalDetails();
        animal.stream().filter(n -> n.color().equals("white")).limit(2).forEach(n -> System.out.println(n.animalName()));

    }

}

    record Animal(String animalName,String color) {


    }
class AnimalData {
    public static List<Animal> getAnimalDetails (){
        List<Animal> list = new ArrayList<>();

        Animal a = new Animal("Cow","white");
        Animal a1 = new Animal("Horse","brown");
        Animal a3 = new Animal("Goat","black");
        Animal a4 = new Animal("Bull","white");
        Animal a5 = new Animal("CAt","white");
        list.add(a);
        list.add(a1);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        return list;



    }



}