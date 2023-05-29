public class TypeCastingParentAndChildClassValues {

    public static void main(String[] args) {

        Dog d1 = new Dog(); //here whatever object reference that value printed.
        Animal d2 = new Dog();
        Dog d3 = (Dog) d2; //here we are cahnging the parent class type to child class type.like type casting the value.
        Animal d4 = (Animal) d1;
        System.out.println(d1.x);
        System.out.println(d2.x);
        System.out.println(d3.x);
        System.out.println(d4.x);
    }
    
}

class Animal {

    int x =100;
}
class Dog extends Animal {
    int x =10;
}