//method reference used in functional interfaces only and it is used to reducing the code and repetitions.
@java.lang.FunctionalInterface
interface Duck {
    void main(String str);
}

public class MethodReference1 {

    public static void main(String[] args) { //here code will be repeating that time we use method reference.
//        Duck d = (str) -> {
//
//            System.out.println("hello"+str);
//            System.out.println("uppercase"+str.toUpperCase());
//            System.out.println("Lowercase"+str.toLowerCase());
//        };
//        d.main("haritha");

        Duck d = Roast::hello; //it is a method reference type here we are using Roast class and method name.and whatever taken the function interface method  parameter here also taken same paramters and same return type.
        d.main("haritha"); //here we are using single parameter in main method and  so method reference also taken single parameter with same type.

    }
}
class Roast {

    static public void hello(String str) {

        System.out.println("hello "+str);
        System.out.println("uppercase "+str.toUpperCase());
        System.out.println("Lowercase "+str.toLowerCase());

    }
    static public  void hello(int x) {
        String str = "rock";

        System.out.println("hello"+str);
        System.out.println("uppercase"+str.toUpperCase());
        System.out.println("Lowercase"+str.toLowerCase());



    }
}