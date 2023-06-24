//they are four ways to to eligible for garbage collection.this is first one.whenever reference variable assigning to the null then it eligible because that means it will not pointing objects.
public class NullifyingReference_Variable {

    public static void main(String[] args) {

        Animal a = new Animal("cow","white");
        Animal a1 = new Animal("goat","black");
        a1= null; //hwnever we mentionning null it will not pointing any objects.
        System.out.println(a1);

        
    }

}
class Animal {

    String name ;
    String color;

    Animal () {

    }

    Animal(String name,String color) {

        this.name = name;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", color=" + color + "]";
    }

}