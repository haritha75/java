import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterator23 {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3,5,8,9,4,2);

        ListIterator<Integer> lt = number.listIterator();
        lt.next(); //it means first it will read or print next element here we are prinint three element or values then checking previous value are availble or not if availble it print the value and again go to check previous value untill complete the values.
        lt.next();
        lt.next();
        int num1 = lt.previous();
        System.out.println(num1);
        System.out.println(lt.previousIndex());
        System.out.println(lt.hasPrevious());
        int num2 = lt.previous();
        System.out.println(num2);
        System.out.println(lt.previousIndex());
        System.out.println(lt.hasPrevious());
        int num3 = lt.previous();
        System.out.println(num3);
        System.out.println(lt.previousIndex());
        System.out.println(lt.hasPrevious());

    }
}



