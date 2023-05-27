import java.util.Arrays;
import java.util.List;

public class WildCardsWithSuperClass {

    public static void main(String[] args) {
        List<Object> li = Arrays.asList(3.55f);
        print(li);

       List<Float> li1 = Arrays.asList(3.55f); //here we are using type float but we mentioning super so float is not a parent class of number class.
       // print(li1);

        List<Float> l = Arrays.asList(3.58f);
        print1(l);


    }

    public static void print(List<? super Number> t) { //whenever write super it allows parents classes only so number class parent is object class.it is a wild card in methods
        System.out.println(t);
    }

    public static<T extends  Number> void print1(List<T> d) { //it is generics type used in methods
        System.out.println(d);
    }
}
