import java.util.Optional;

//when you code not successfully executed all the time  or when you are in doubt then use optional class.use of optional class if your code is not run successfully then that time optional class provide default things.it does not not occurs exception or errors.
public class OptionalClass {

    public static void main(String[] args) {

        String str =  null; //null

        Optional<String> optional = Optional.ofNullable(str); //if not sure your value null or value then use .ofNullable() method.
        if(optional.isPresent())
         System.out.println(optional.get());
         else
         System.out.println("String does not contains any value");
        

    }
}