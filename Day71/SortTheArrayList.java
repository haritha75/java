    

import java.util.*;

public class SortTheArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> li = new ArrayList<Integer>();

        li.add(10);
        li.add(4);
        li.add(9);
        li.add(2);
        li.add(1);

        Collections.sort(li); //sorting the given list using arraylist class

        for(var i:li) {
            System.out.println(i);
        }
    }
    
}