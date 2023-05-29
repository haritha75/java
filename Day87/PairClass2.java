import javafx.util.Pair;

public class PairClass2 {
    
    public static void main(String args[]) {
        Pair<Integer,String> p = new Pair<>(4,"Four");

            System.out.println(p.getKey());
            System.out.println(p.getValue());
        
         p = new Pair<>(8,"haritha"); //it will be store 
        
            System.out.println(p.getKey());
             System.out.println(p.getValue());
        
    }
}
    

