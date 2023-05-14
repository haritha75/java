import java.util.*;
public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<String> li = new LinkedList<>();

        li.add("hari");
        li.add("haritha");
        li.add("reddy");
        li.add("harika");

        Iterator<String> i = li.iterator();
        
        while(i.hasNext()) { //it read each next charcter or checks it available or not. 
            System.out.println(i.next()); //it print next character.
        }
        

    }
    
}
