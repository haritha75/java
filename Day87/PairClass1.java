//pair class nothing but it stores only one pair at a time not store multiple pairs at a time like hashmap.
//every time it stores only one pair only.
import javafx.util.Pair;

public class PairClass1 {
    public static void main(String args[]) {
        Pair<Integer,String> p = new Pair<>(4,"Four");
        
        System.out.println(p.getKey());
        System.out.println(p.getValue());
        
    }
}