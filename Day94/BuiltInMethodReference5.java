@java.lang.FunctionalInterface
interface Rock6 {

    void x(String str);
}
public class BuiltInMethodReference5 {

    public static void main(String[] args) {

        Rock6 r = System.out::println;
        r.x("haritha");
    }
}


