import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPassword {

    public static void main(String[] args) {
        
        Pattern p = Pattern.compile(".........");
        Matcher password = p.matcher("harithaa");

        if(password.matches()) {
            System.out.println("Strong password");
        }
        else {
            System.out.println("enter eight characters");
        }
    }
    
}
