import java.lang.reflect.Method;

public class GettingMethodsUsingAnnotation {
    public static void main(String[] args) {
        for(Method m : Raj.class.getDeclaredMethods()) {
            System.out.println(m.getName());

        }

        Raj r1 = new Raj();

        for(Method m : r1.getClass().getDeclaredMethods()) {
            if(m.getName().equals("printLn")) { //in this method we are mentioning two same annotaion with different values.
                Cock[] x = m.getAnnotationsByType(Cock.class); //two annotaion values stored in this array.
                System.out.println(x[0]); //here we are appliying same type of two annotaion in raj class printLn method only.and we are mentioning only star and rating will be default.
                System.out.println(x[1]);
            }

        }


    }


}
