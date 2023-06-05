@java.lang.FunctionalInterface
interface Fork {

    void mock(double s);
}

public class MethodReference2 {

    public static void main(String[] args) {

//        Shock f1 = new Shock();
//        Fork f2 = f1::hello;
//

        Fork f =  Shock::hello; //not mention brackets to the method.
        f.mock(4.7); //here we are passing single parameter method so in method reference also take single parameter with same datatype method same return type.


    }
}
class Shock {

    public static void hello() {
        System.out.println("rock");


    }
    static public void hello(double x) {
        System.out.println("hello method with single paramter");
    }

}
