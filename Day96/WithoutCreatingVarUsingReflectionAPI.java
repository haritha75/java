import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
//with the use of reflection api all instance variables,and even private variables and set even private variables.
//i can call private methods outside the class.
//all constructors,annotations we can use outside the class also.
public class WithoutCreatingVarUsingReflectionAPI {

    public static void main(String[] args) {
        Class c = Shock.class; //it is not creating object or variable it is a reflection type here class is a keyword type

        Field fields[] = c.getDeclaredFields();
        for(var x: fields)
        System.out.println(x);

        for(var x1:c.getDeclaredConstructors()) {
         System.out.println(x1);
         System.out.println(x1.getParameterTypes());
         System.out.println(x1.getParameterCount());
        }


        for(var r : c.getAnnotations()) {
            System.out.println(r);
        }

        
    }
    
}
