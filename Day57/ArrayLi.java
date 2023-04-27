//arraylist is class it is used to resize the array.their is no size limit.
//no wastage of storage .
import java.util.*;

public class ArrayLi {

    public static void main(String[] args) {
        
        ArrayList<BuiltInclass> li = new ArrayList<BuiltInclass>(); //integet means which datatype you want use that datatype like String also.

        li.add(234);
        li.add(678);
        li.add(999);
        System.out.println(li.get(2)); // it is used access the value
        li.set(2,444);
        System.out.println(li.get(2)); // it is used modify the value.

    }
    
}
