
//when compared to linked list .array takes less time to perform operations.but array does not change size once fixed.
//linked list takes more space compared array because it store address also.
//linked list dones not access elements with index.
import java.util.*;

public class ArrayAndLinkedList {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int a[] = new int[10000000];

        for(int i=0;i<10000000;i++) {
            a[i] = i;
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);


        LinkedList li = new LinkedList<>();

        long start1 = System.currentTimeMillis();

        for(int j=0;j<10000000;j++) {
            li.add(j);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

        
    }
}
