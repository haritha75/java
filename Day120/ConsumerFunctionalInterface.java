import java.util.function.Consumer;
//it is functional interface it have accept method also.
//it takes any data types argument but not return anything.
//you can overriding accept method using lambda expressions.

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {
        
        Consumer<String> consumer =  str -> System.out.println(str);

        consumer.accept("haritha");
    }
    
}
