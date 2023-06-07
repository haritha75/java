import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotationAndReflectionAPI {

    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Haritha h = new Haritha("haritha");

        boolean b = Haritha.class.isAnnotationPresent(VIP.class); //it check vip annotaion containing the class or not.
        boolean b1 =h.getClass().isAnnotationPresent(VIP.class);
        System.out.println(b1);
        Ramya r = new Ramya("ramya");

        boolean c = r.getClass().isAnnotationPresent(VIP.class);
        System.out.println(c);


        if(b1) {
            h.printLn();
        }
        else {
            h.print();
        }


        if(c) {
            r.printLn();
        }

        else {
            r.print();
        }



        for(Method m : h.getClass().getDeclaredMethods()) {
            if(m.getName().equals("print")) {
                m.invoke(h); //calling the method using invoke method.
            }
        }

        
    }
    
}
@VIP

class Haritha {

    String name;

    Haritha() {

    }
    Haritha(String name) {
        this.name = name;

    }
    void print() {
        System.out.println(name.toUpperCase());
    }
    void printLn() {
        System.out.println(name.toLowerCase());
    }

    
}

class Ramya {

    String name;
    Ramya() {

    }
    Ramya(String name) {
        this.name = name;
    }
    void print() {
        System.out.println("hello "+name.toLowerCase());
    }
    void printLn() {
        System.out.println(name.toUpperCase());
    }

}
@Retention(RetentionPolicy.RUNTIME) //annnotaion will be printed at runtime also.
@interface VIP {


}