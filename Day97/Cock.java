import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(CockContainer.class) //it accept same type of annotation
public @interface Cock {

    int rating() default 1 ;
    String  star();
}
@Retention(RetentionPolicy.RUNTIME)

@interface CockContainer {

    Cock[] value();

}