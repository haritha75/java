//GC Overhead limit Exceeded :  This error occurs  at the garbage collector is runnning all the time and java program is making very slow progress.
//after garbage collection,if java process spending more than approximately 98% of its time doing garbage collection and if it is recovering less than 2% of the heap.then a outofmemmoryerror is thrown.





import java.util.*;
public class OutOfMemoryErrorEx {
     public static void main(String args[]) throws Exception
    {
        Map m = new HashMap();
        m = System.getProperties();
        Random r = new Random();

        while (true) {
            m.put(r.nextInt(), "randomValue");
        }
    }
}