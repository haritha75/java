import java.util.*;
public class SearchingInLinkedList {

    public static void main(String[] args) {
        
        LinkedList<Integer> li = new LinkedList<>();
         li.add(90);
         li.add(45);
         li.add(85);
         li.add(95);
         li.add(55);
         li.add(35);

         int ele = 85;
         int ans = -1;

         for(int i=0;i<li.size();i++) {

            int ele1 = li.get(i);

            if(ele1 == ele) {
                ans = i;
                break;
            }
         }

         if(ans != -1) {
            System.out.println("element found at "+ans);
         }
         else {
            System.out.println("element not  found");
         }
    }
}