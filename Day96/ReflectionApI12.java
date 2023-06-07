
import java.lang.reflect.Field;

public class ReflectionApI12 {
    public static  void main(String[] args) throws IllegalAccessException {

      Shock s1 = new Shock();
        Field[] fields = s1.getClass().getDeclaredFields(); //it returns all variables
        for(Field x1 : fields)
            if(x1.getName().equals("z")) { //it tells type of the variable also and variable names also.
                x1.setAccessible(true);
                x1.set(s1,8); //here we are set the value even if private variable also.
                System.out.println(s1.getZ());
            }



    }
}


