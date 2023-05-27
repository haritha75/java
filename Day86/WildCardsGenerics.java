import java.util.*;

//if you have particular object or class or interface that type we can with wildcardgenerics it will only whatever you mention that type only
public class WildCardsGenerics {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,5,7,9,5);
        print(list);

        Vector<Integer> list2 = new Vector<>();
        list2.add(90);
        list2.add(30);
        print(list2);

        ArrayList<Float> list3 = new ArrayList<>();
        list3.add(34.5f);
        list3.add(98.5f);
        print(list3);

        LinkedList<Long> list4 = new LinkedList<>();
        list4.add(2L);
        list4.add(9L);
        print(list4);
    }

    public static void print(List<?> t) { //? is called wildcard it allows any type and here we mention list interface whatever the list classes  and list will be allowed.
        System.out.println(t);
    }
}
