import java.lang.annotation.Annotation;

public class Main1 {

    public static void main(String[] args) {

        Raj r = new Raj("raj");
        Class c = r.getClass();
        Annotation a[] = r.getClass().getAnnotations();
        System.out.println(a[0]);

        Cock[] cocks = Raj.class.getAnnotationsByType(Cock.class); //in raj class have two same type of annotaion that are stored in array type is annotaion.
        System.out.println(cocks.length);
        System.out.println(cocks[0]+" "+cocks[1]);
        System.out.println(cocks[1].star()); //it print only star method.
        System.out.println(cocks[1].rating());
        System.out.println(cocks[0].star());
        System.out.println(cocks[0].rating());
    }
}
