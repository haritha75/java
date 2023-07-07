import java.util.function.BiConsumer;
 //biconsumer  is a functional interface and bi means it takes two inputs and consumer not return anyhting.
public class BiConsumerEx {
    public static void main(String[] args) {
        
        BiConsumer<Integer,Integer>  biConsumer = (n1,n2) -> System.out.println(n1+" "+n2);

        biConsumer.accept(5, 8);
    }
    
}
