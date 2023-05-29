    
import javafx.util.Pair;
import java.util.*;
public class Pairclass12 {

    
    public static void main(String args[]) {
        
        int marks[] = {44,77,65,89,75,22};
        String names[] = {"bheem","rajini","eshan","raghu","neel","tej"};
        
         ArrayList<Pair<String,Integer>> li = new ArrayList<>();
         
       for(int i=0;i<marks.length;i++) {
           
        Pair<String,Integer> p = new Pair<>(names[i],marks[i]);
        li.add(p); //here, we are adding pair class keys and values to the list.
       }
        
         
        System.out.println(li.toString());
    }
}