import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPI22 {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
     
        
        Shock s = new Shock();
        Method[] m = s.getClass().getDeclaredMethods();
     
        for(Method x : m) {

          if(x.getName().equals("display")) {

          x.setAccessible(true);
          x.invoke(s,5,"hari"); //calling the method using invoke method.if method not containing the method paramters then mentioning null.
    }

    
}
    }
}