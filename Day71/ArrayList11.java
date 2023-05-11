import java.util.ArrayList;

//arraylist is class it is used to resize the array.their is no size limit.
//no wastage of storage .
//array list capacity is 10 then it creasing 50% of full size or decreasing also if you remove the element.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList11 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
         System.out.println(colors.size());
         colors.add("purples");
         colors.add("black");
         colors.add("white");
         colors.add("pink");

        Collections.sort(colors); //it is used sorting the data.
        System.out.println(colors); //here defultly tostring object calling it gives values or objects.
        System.out.println(colors.toString());
        System.out.println(colors.remove(2));
        System.out.println(colors.get(1));
        colors.clear();
        System.out.println(colors);


    }
}