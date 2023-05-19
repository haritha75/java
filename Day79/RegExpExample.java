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
        System.out.println();

        System.out.println(Pattern.matches("x{5}", "xxxxx")); //enter exact 5 character of given character.
        System.out.println(Pattern.matches("x{4,}","xxxxxxxx")); // enter 4 or more characters.
        System.out.println(Pattern.matches("x{4,7}..", "xxxxxba")); //enter between 4 to 7 characters.
        System.out.println();

        System.out.println(Pattern.matches("^bca", "bca")); //it matches regex at the beginning of the line.
        System.out.println(Pattern.matches("^a..c..", "abbcdd"));
        System.out.println(Pattern.matches("...bda$", "abcbda")); //matches regex at the end of theline.
        System.out.println(Pattern.matches("[haritha]", "r")); //it can mathc any of the letter from regexp.
        System.out.println(Pattern.matches("[haritha][23456]", "i5")); //it can matches any of the letter of each regexp.
        System.out.println(Pattern.matches("[^haritha]", "z")); //it macthes without regexp character we can mention any characters.
        System.out.println(Pattern.matches("[a-z]", "g")); //you can mention any one from a to z.
        System.out.println(Pattern.matches("[a-zA-Y0-9]", "H")); //you can mention any one from a to z or A to z or 0 to 9.
        System.out.println(Pattern.matches("xx", "xx"));
        System.out.println(Pattern.matches("[a-f[m-t]]", "t")); //union of a to f and m to t.
        System.out.println(Pattern.matches("[a-z&&p-y]", "q")); //intersection between  two ranges.
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "a")); //a to z unioon with except b and c.
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "h")); // a-z union with except range  m to p.
        System.out.println();

        System.out.println(Pattern.matches("\\d", "9")); //it checks all characters or elements are numbers.
        System.out.println(Pattern.matches("\\D", "h")); //it checks all elements or non-numbers.
        System.out.println(Pattern.matches("\\s", " ")); //it checks it contains all whitespaces
        System.out.println(Pattern.matches("\\S", "g")); //it checks it contains non-spaces.
        System.out.println(Pattern.matches("\\w", "7")); // word character,[a-zA-Z_0-9].
        System.out.println(Pattern.matches("\\W", " ")); //non word characters,[^\w].
       // System.out.println(Pattern.matches("\\b", "6")); //word boundary
        // System.out.println(Pattern.matches("\\B", " ")); //non word boundary
    }
    
}
