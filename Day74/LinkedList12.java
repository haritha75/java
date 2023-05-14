import java.util.*;
public class LinkedList12 {

    public static void main(String[] args) {


        LinkedList<Integer> li = new LinkedList<>();

        System.out.println(li);

        li.add(80);
        li.add(45);
        li.add(90);

        System.out.println(li);

        li.add(1,40);
        System.out.println(li);

        LinkedList<Integer> li1 = new LinkedList<>();

        li1.add(85);
        li1.add(75);
        
        li.addAll(li1); //here we are adding li1 to the li.

        LinkedList<Integer> li2 = new LinkedList<>();

        li2.add(76);
        li2.add(54);

        li.addAll(1,li2); //here li2 adding in first index of li.

        li.addFirst(99);
        li.addLast(100);

        System.out.println(li);

        


    }
    
}
