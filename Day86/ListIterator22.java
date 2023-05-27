import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

    //list iterator is used to getting values in reversed order.
    public class ListIterator22 {


        public static void main(String[] args) {

            List<Integer> number = Arrays.asList(3,5,8,9,4);

            ListIterator<Integer> lt = number.listIterator();
           lt.next(); //it means first it will read or print next element here we are prinint three element or values then checking previous value are availble or not if availble it print the value and again go to check previous value untill complete the values.
           lt.next();
           lt.next();

            while(lt.hasPrevious())
                System.out.print(lt.previous()+",");
        }
    }

