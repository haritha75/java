import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//it is mainly used for without looking another class we getting information for this purpose we are using reflection api.
//it is like a mirror.
//using .getClass() you are getting the data from another class.
public class Reflection_API1 {
    public static void main(String[] args) {


        Shock s = new Shock();
//        Method[]  methods = s.getClass().getDeclaredMethods(); //it means whatever you declaring the methods in shock class it displays.that are storerd in one array
//        for(Method x : methods)
//            System.out.println(x); //printing all the shock class methods.
//
//        Annotation[] annotations = s.getClass().getDeclaredAnnotations();
//        for(Annotation a : annotations)
//            System.out.println(a);
        Field[] fields = s.getClass().getDeclaredFields(); //it returns all variables
        for(Field x1 : fields)
            System.out.println(x1); //it tells type of the variable also and variable names also.



    }
}
