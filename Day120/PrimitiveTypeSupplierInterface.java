import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveTypeSupplierInterface {

    public static void main(String[] args) {
        

        IntSupplier intSupplier = () -> 30; //it does not take any argument but int return int type only.
        System.out.println(intSupplier.getAsInt());

        DoubleSupplier doubleSupplier = () -> 30;
        System.out.println(doubleSupplier.getAsDouble());

        LongSupplier longSupplier = () -> 23333456;
        System.out.println(longSupplier.getAsLong());
        

    }
    
}
