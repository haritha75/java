//function interface nothing but it contains only one abstract method.
@java.lang.FunctionalInterface
interface Rock2 {
    void main(int x);
}
public class FunctionalInterface2 {

    public static void main(String[] args) {

        Rock2 r= x -> System.out.println("rock"); //it is lambda expression like anynomous class type.
        r.main(3);


    }
}
