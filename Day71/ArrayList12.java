    

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList12 {


    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
         System.out.println(colors.size());
         colors.add("purples");
         colors.add("black");
         colors.add("white");
         colors.add("pink");

         for(String i : colors) {
            System.out.println(i);
         }
         System.out.println(colors.size());

    }
}