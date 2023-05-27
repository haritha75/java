import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCard {

    public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

        printlist(list1);

        printlist(list2);
    }

    private static void printlist(List<?> list) { //here we are mentioning anything like super keyword and extends keyword that means it is a unboundwildcard.it accept all.


        System.out.println(list);
    }
}
