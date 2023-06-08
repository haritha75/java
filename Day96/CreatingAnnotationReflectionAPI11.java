import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


 public class CreatingAnnotationReflectionAPI11 {

    public static void main(String[] args) {
        Haritha h = new Haritha();

        Class c = h.getClass();

        Annotation a = c.getAnnotation(PRIORITY.class);
        PRIORITY priority = (PRIORITY) a;
        System.out.println(((PRIORITY ) a).rating());

        System.out.println(((PRIORITY ) a).star());

        

        Lakshmi l = new Lakshmi();

        Class c1 = l.getClass();

        Annotation a1 = c1.getAnnotation(PRIORITY.class);
        PRIORITY priority1 = (PRIORITY) a1;
        System.out.println(((PRIORITY ) a1).rating());

        System.out.println(((PRIORITY ) a1).star());
       

    }

}
@PRIORITY(rating = 8,star = "cancer")
class Haritha {

}
@PRIORITY(star = "capicon")
class Lakshmi {

}
@Retention(RetentionPolicy.RUNTIME)

@interface PRIORITY { //annotation is priority

    int rating() default 1;

    String star();

}