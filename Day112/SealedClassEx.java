public class SealedClassEx {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.printName();
        Bike b = new Bike();
        b.printName();
        Engine e = new Engine();
        e.printName();
        Oil_Stump o = new Oil_Stump();
        o.printName();
        Oil_Stump1 o1 = new Oil_Stump1();
        o1.printName();

    }
    
}
sealed class Vehicle permits Bike {

    void printName() {
        System.out.println("it is vehicle class");
    }
}
sealed class Bike extends Vehicle {

    void printName() {

        System.out.println("it is a Bike class");
    }
}
sealed class Engine extends Bike {
    void printName() {
        System.out.println("if you sealed class then must be extends atleast one class either non-sealed or final class if not extends then it shos error");
    }
}

final class Oil_Stump extends  Engine { //final class cannot extends the another class.
    void printName() {
        System.out.println("it is oilstump class");
    }
}
non-sealed  class Oil_Stump1 extends  Engine {
    void printName() {
        System.out.println("it is non sealed class extends the engine class");
    }
}