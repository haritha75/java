import java.util.function.Supplier;
 //it does not accept any argument but it returns any data type as result.
public class SuplierFunctionalInterface {

    public static void main(String[] args) {
        
        Supplier<String> supplier = () -> "haritha";
        System.out.println(supplier.get()); //here it does not take anything but it returns any data type.
    }
    
}
