import java.util.regex.Matcher;
import java.util.regex.Pattern;

//RegExp is an API to define a pattern for searching or manipulating strings.
public class RegExp1 {

    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("ha");
        Matcher m = p.matcher("ha");

        System.out.println(m.matches()); // it checks given characters is same or not in regexp.
    }
}