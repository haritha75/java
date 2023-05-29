//method chaining means calling multiple methods at a time.
//for the use of method chaining is reducing the duplicates.
public class MethodChaining {

    public static void main(String[] args) { //in below we are calling different methods at a time.

        String name = "   haritha".concat(" yerukondu").trim().toUpperCase().replace("I","ii").toString().toLowerCase();
        System.out.println(name);

    }
}
