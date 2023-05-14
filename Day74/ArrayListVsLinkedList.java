import java.util.*;
//when compared to arraylist and linkedlist arraylist performance is best it takes less time .

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        
    

        ArrayList<Integer> li1 = new ArrayList<>();

        long start = System.currentTimeMillis();

        for(int i = 0; i <= 10000000; i++) {

            li1.add(i);

        }

        long end = System.currentTimeMillis();

        System.out.println(end-start); 

      LinkedList<Integer> li2 = new LinkedList<>();

        start = System.currentTimeMillis();

        for(int i = 0; i <= 10000000; i++) {

            li2.add(i);

        }

        end = System.currentTimeMillis();

        System.out.println(end-start);

    }
}
