import java.util.Arrays;


import java.util.Arrays;
import java.util.List;
public class ConvertingListToArrayAndArrayToList {

    public static void main(String[] args) {
        

        int a[] = {2,6,8,3,6,9};

        List<int[]> li = Arrays.asList(a); //here array converting into list.
        Object a1[] = li.toArray(); //again list converting into array using object class reference because it is a parent class of all other child classes.
        System.out.println(Arrays.toString(a1));
    }
    
}
