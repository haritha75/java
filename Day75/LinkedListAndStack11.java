import java.util.Stack;

import java.util.*;

//compared linked list stacks takes less time to perform operations.

public class LinkedListAndStack11 {

    public static void main(String[] args) {
        

        long start = System.currentTimeMillis();

        Stack li = new Stack<>();

        for(int i=0;i<10000000;i++) {
            li.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);


         LinkedList li1 = new LinkedList<>();
        long start1 = System.currentTimeMillis();

        for(int j=0;j<10000000;j++) {
            li1.add(j);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

    }
    
}
