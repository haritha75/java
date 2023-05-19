import java.util.regex.Pattern;

public class RegExpExample {

    public static void main(String[] args) {
        
        System.out.println(Pattern.matches(".a","ha")); //true . means any character and must enter regexp pattern .
        System.out.println(Pattern.matches(".s", "sk")); //false because we are not followed regexp pattern.
        System.out.println(Pattern.matches("..r00", "har00")); //ture
        System.out.println(Pattern.matches("...", "roc")); //true

        System.out.println(Pattern.matches("s*", "")); // *  means enter o or more characters of given character.
        System.out.println(Pattern.matches(".x..k*", "hxarkkkk"));
        System.out.println(Pattern.matches("x?00", "xx00")); //false because ? means enter o or one character only donot enter more characters.
        System.out.println(Pattern.matches("x+", "xx")); //atleast enter one or more character donot use empty.

        System.out.println(Pattern.matches("x{5}", "xxxxx")); //enter exact 5 character of given character.
        System.out.println(Pattern.matches("x{4,}","xxxxxxxx")); // enter 4 or more characters
        System.out.println(Pattern.matches("x{4,7}..", "xxxxxba")); //enter between 4 to 7 characters
    }
    
}
