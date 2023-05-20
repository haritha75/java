import java.util.regex.Pattern;

public class VaribleAndMethodMatches {

    public static void main(String[] args) {
        boolean p = Pattern.matches("[^\\dA-Z]{1}[a-zA-Z0-9$_\\S]", "varibleDeclaration");
        System.out.println(p);
    }
    
}
