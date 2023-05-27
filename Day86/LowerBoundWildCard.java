import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCard {

        public static void main(String[] args)
        {
            List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

            printOnlySuperClass(list1);

            List<Number> list2 = Arrays.asList(9, 5, 6, 2);
            printOnlySuperClass(list2);

            List<Object> li2 = Arrays.asList(6,7,9,3);
            printOnlySuperClass(li2); //here object class also parent class. its working.

        }

        //in lower bound wildcard we using super keyword that means parents classes.
        public static void printOnlySuperClass(List<? super Integer> list) //here we mention super  and integer so it allows integer and integer parent classes.integer parent class is number class.this is the expression of lower bound wild card .
        {
            System.out.println(list);
        }
    }

