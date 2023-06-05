//function interface nothing but it contains only one abstract method.
@java.lang.FunctionalInterface
interface Rock {
    void main();
}
public class FunctionalInterface {

    public static void main(String[] args) {

        Nock n= new Nock();
        n.main();

    }
}
class Nock implements Rock { //interface class you must have to implement another method or use annonymous class or lambda expression.


    @Override
    public void main() {

        System.out.println("rock");

    }
}