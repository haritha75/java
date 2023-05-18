import java.util.HashSet;
import java.util.Iterator;
//inset printing values or elements ascending order.
public class HashSetFun {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(40);
        set.add(33);
        set.add(20);
        set.add(77);
        System.out.println(set);
        System.out.println(set.contains(33));
        System.out.println(set.isEmpty());
        System.out.println(set.remove(20));
        System.out.println(set.size());
        
        Iterator<Integer> set1 = set.iterator();
        while(set1.hasNext()) {
            System.out.println(set1.next());
        }
        set.clear();
            System.out.println(set);
        
        

    }
    
}
