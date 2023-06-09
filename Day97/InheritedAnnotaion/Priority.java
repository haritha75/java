import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
//it means where the priority annotaion that time we are extending the anpther class  it will inherite the all the features to that class.
public @interface Priority {

    int rating() default 1;
    String star();
 }
 @Retention(RetentionPolicy.RUNTIME)
 @interface PriorityContainer { //annotaion working like a interface type means ut takes only static,final variable and  abd abstract methods only.

    Priority[] value();

 }