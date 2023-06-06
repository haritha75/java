import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//we are mentioning annotation in 6 ways or use annotation in 6 times.
@IsProgrammer
public class CreatingAnnotation1 {
    @IsProgrammer
    static int c;
@IsProgrammer
    public static void main(@IsProgrammer String[] args) {
        @IsProgrammer
        int x;

    }
}
@Retention(RetentionPolicy.SOURCE) //annotations will be retained at the source level and ignored by the compiler like commnets.
//@Retention(RetentionPolicy.RUNTIME) //annotation will be retained at runtime
//@Retention(RetentionPolicy.CLASS)// annotation retained at compile-time and ignored by jvm like like annotation names.

//it is used if you apply annotation only particular one use like this.

@Target({ElementType.LOCAL_VARIABLE, ElementType.CONSTRUCTOR})     //here we mentioning two type remanings shows errors.
@interface IsProgrammer { // creating a custome annotation

}
@IsProgrammer
class Duck {
    @IsProgrammer
    int d=7;
    @IsProgrammer
    Duck() {

    }
    @IsProgrammer
    void nick(@IsProgrammer int x) {
        @IsProgrammer
        int c=8;
    }

}