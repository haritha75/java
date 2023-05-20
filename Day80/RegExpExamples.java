import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExamples {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("\\d", "9")); //it checks all characters or elements are numbers.
        System.out.println(Pattern.matches("\\D", "h")); //it checks all elements or non-numbers.
        System.out.println(Pattern.matches("\\s", " ")); //it checks it contains all whitespaces
        System.out.println(Pattern.matches("\\S", "g")); //it checks it contains non-spaces.
        System.out.println(Pattern.matches("\\w", "7")); // word character,[a-zA-Z_0-9].
        System.out.println(Pattern.matches("\\W", " ")); //non word characters,[^\w].


        System.out.println(Pattern.matches("\\d{3}\\s{1,}", "123   "));
        System.out.println(Pattern.matches("\\s\\w\\W{2}", " s!?"));
        System.out.println(Pattern.matches("hari|haritha|ha", "haritha")); //any one enter.
        System.out.println(Pattern.matches("[a-c|vh]", "v")); 
        System.out.println();

        Pattern p = Pattern.compile("\\s\\d\\w");
        Matcher m = p.matcher(" 3cdd|rrr 5e");
        System.out.println(m.find()); //finds means it will not caring length of the string it ignore the length .it finds next subsequence of the input sequnces..
        System.out.println(m.matches());

        Pattern p1 = Pattern.compile("^a[a-z]{3}k$");
        Matcher m1 = p1.matcher("ahark");
        System.out.println(m1.find()); 
        System.out.println(m1.matches());


       
    }
}