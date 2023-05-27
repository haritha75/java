import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//list iterator is used to getting values in reversed order.
public class ListIterator11 {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(3,5,8,9,4);

        ListIterator<Integer> lt = number.listIterator();
         while (lt.hasNext())
             System.out.print(lt.next());
        System.out.println();

         while(lt.hasPrevious())
             System.out.print(lt.previous());
    }
}
