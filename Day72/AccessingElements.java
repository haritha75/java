import java.util.Vector;
public class AccessingElements {

    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(45);
        v.add(50);

        for(int i=0;i<v.size();i++) {
            
            System.out.println(v.get(i));
        }

    }
    
}
