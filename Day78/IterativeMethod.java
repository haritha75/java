import java.util.ArrayList;
import java.util.Iterator;
//iterative method is used to iterativing all the values or accessing all the values.
public class IterativeMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> li =  new ArrayList<>();
        li.add(10);
        li.add(33);
        li.add(90);
        li.add(20);
        Iterator<Integer> it = li.iterator();

        while(it.hasNext()) { //it checks whether element is their or not if not loop stoped.otherwise it will go to next statement.

            System.out.println(it.next()); //here if while condition true then return that element and again calling or moving to next element and again while condition checking repeate process untill elements not in the list.
        }
    }
    
}
