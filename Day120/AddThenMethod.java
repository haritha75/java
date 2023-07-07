import java.util.function.Consumer;
//addThen() is used to if you want to mentioning same data type to the different statement use this method.
public class AddThenMethod {

    public static void main(String[] args) {
        
        Consumer<Integer> c = n1 -> System.out.println(n1+10);
        Consumer<Integer> c1 = n1 -> System.out.println(n1+90);
        Consumer<Integer> c3 = n1 -> System.out.println(n1+55);
        c.andThen(c1).andThen(c3).accept(75);



    }
    
}
