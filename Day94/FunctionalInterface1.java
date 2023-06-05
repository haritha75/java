//function interface nothing but it contains only one abstract method.
@java.lang.FunctionalInterface
interface Rock1 {
    void main();
}
public class FunctionalInterface1 {

    public static void main(String[] args) {

        Rock1 n= new Rock1() { //it is anonymousclass.it is used to without creating new class we can implementing the interface methods.
        public void main() {

                System.out.println("rock");

            }
        };
        n.main();

    }
}
