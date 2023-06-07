import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@VIP
public class CustomAnnotation1 {

    public static void main(String[] args) {

    }
}
@VIP
interface Roast {

}
@VIP
enum Sizes {
    M,L,S;
}
@VIP
abstract class Duck {

}
@Target({ElementType.TYPE}) //if you applied some particular one mention like this.it accept only types means classes only.
@Retention(RetentionPolicy.RUNTIME) // it will be run at runtime level
@interface VIP { //VIP is  annotation

}
