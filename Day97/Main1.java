import java.lang.annotation.Annotation;

public class Main1 {

    public static void main(String[] args) {

        Raj r = new Raj("raj");
        Class c = r.getClass();
        Annotation a[] = r.getClass().getAnnotations();
        System.out.println(a[0]);
    }
}
