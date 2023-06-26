public class SealedClassExample {

    public static void main(String[] args) {

        Human h = new Human();
        h.printName();
        Human h1 = new Neel();
        h1.printName();
        Human h2 = new Raj();
        h2.printName();

    }
}
sealed class Human  { //here e are mention permits class that menans it can extends any class means non-sealed and final classes only.
    void printName() {
        System.out.println("it is a human class");
    }
}
non-sealed  class  Neel extends  Human {
    void printName() {
        System.out.println("it is a neel class");
    }
}
final class Raj extends Human {

    void printName() {
        System.out.println("it is a raj class");
    }
}