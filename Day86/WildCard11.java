import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class WildCard11 {

    public static  void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(99);
        print(list);


        Vector<Integer> list2 = new Vector<>();
        list2.add(90);
        list2.add(30);
        print(list2);

        List<Float>  f = Arrays.asList(7.4f,8.3f,4.7f,5.0f,2.44f);
        print(f);

    }

    public static void print(List<? extends Number> a) { //here we are mentioning list but above we are mentioning arraylist also it's woriking because list is interface it implemnts the ArrayList,Vector classes.
        System.out.println(a); //? it allows any type.but here we mentinong number class so it allows number class and then number class subclasses.
    }
}
