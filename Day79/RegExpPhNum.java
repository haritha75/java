import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;
public class RegExpPhNum {

    public static void main(String[] args) {
        
        Pattern ph = Pattern.compile("..........");
        Scanner sc = new Scanner(System.in);
        

        Matcher m;
        do {

            System.out.println(" enter ph number:");
            String phNum = sc.next();
            m = ph.matcher(phNum);

        }while(!m.matches());

        System.out.println("you entered right ph number");

    }
    
}
