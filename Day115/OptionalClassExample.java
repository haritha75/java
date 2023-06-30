import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {
        

        String name = null;
        Optional<String>  optional = Optional.ofNullable(name);

        optional.ifPresentOrElse(n -> System.out.println(n), () -> System.out.println("it's empty")); //if you writing totoal statement in one line use isPresentOrelse() method.

        String name1 = "rock";
        Optional<String>  optional1 = Optional.ofNullable(name1);
        optional1.ifPresentOrElse(n -> System.out.println(n), () -> System.out.println("it's empty"));


    
    }
    
}
