    //hashset contains  only keys not contain values.
//it will not allows diplicates keys.

import java.util.HashSet;
import java.util.Iterator;
public class HashSet12 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        int a[] = {4,7,9,1,0,3,8};

        for(int i=0;i<a.length;i++) {
            set.add(a[i]);
        }

        System.out.println(set);

        int target = 10;
        Iterator<Integer> va = set.iterator();

        while(va.hasNext()) {

            int cur = va.next();
            int req =  target - cur;
            
            if(set.contains(req)) //it checks elements available or not order is O(1).
               
            System.out.println(cur+" + "+req+" = "+target);


        }


    }
}