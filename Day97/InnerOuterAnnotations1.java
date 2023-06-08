import java.lang.annotation.Annotation;

public class InnerOuterAnnotations1 {

    public static void main(String[] args) {

        Rock r = new Rock();
        Class c  = r.getClass();
        Annotation b =  c.getAnnotation(VIP.class);
        System.out.println(b);


    }
}
