import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Virat h = new Virat("virat"); //Haritha h = new Haritha("haritha) ,here we are inherite the all values from haritha class to virat class.
        Class c = h.getClass();

        if (h.getClass().isAnnotationPresent(Priority.class)) {

            Method[] methods = h.getClass().getDeclaredMethods();
            System.out.println("yes");

            Annotation a = c.getAnnotation(Priority.class);
            Priority priority = (Priority) a;
            //System.out.println(Priority.rating());


            for (Method x : methods) {
                for (int i = 0; i < priority.rating(); i++) {
                    if (x.getName().equals("dost")) {
                        x.invoke(h, null);

                        if (priority.star().equals("scorpio")) {
                            System.out.print("-");
                        }
                    }
                }
            }
        }
    }

}

