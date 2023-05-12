    
import java.util.Vector;

//vecot class also same arraylist but in vectors class multiple datatype using at a time.
public class VectorClass2 {


    public static void main(String[] args) {
        

        Vector items = new Vector(); //if you want multiple datatypes donot use generic like this <Integer>

        items.add(10);
        items.add(30);
        items.add("string data type");
        items.add(98.54);
        items.add("haritha");

        System.out.println(items);

    }
    
}
