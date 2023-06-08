import java.lang.annotation.Documented;

@MyAnnotaion("haritha")
public class MyClass {

    public static void main(String[] args) {
        System.out.println("this is a main function");

    }

}

@Documented
@interface MyAnnotaion {
    String value();

}