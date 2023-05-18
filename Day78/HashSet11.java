//hashset contains  only keys not contain values.
//it will not allows diplicates keys.

import java.util.HashSet;
public class HashSet11 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        int a[] = {4,7,9,1,0,3,8};

        for(int i=0;i<a.length;i++) { //O(n)
            set.add(a[i]);
        }

        System.out.println(set);


    }
}