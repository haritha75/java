import java.util.Optional;

public class OptionalClassExample1 {

    public static void main(String[] args) {

        print(Optional.ofNullable(null)); //if you confusion you are value null or not use this one
        print(Optional.empty()); //if you are sure  value is empty use this method.
        print(Optional.of("rock")); // if you are sure  value is not null then use this method.
        
    }
    
    static void print(Optional<String> name) {

        name.ifPresentOrElse(n -> System.out.println(name), () -> System.out.println("it' null")); //if value present then it print that value otherwise it print null.


        
    }
}
