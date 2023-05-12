    

import java.util.Vector;
public class AccessingElemnts1 {


    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(45);
        v.add(50);

        for(Integer x : v) {
            
            System.out.println(x);
        }

    }
    
}
