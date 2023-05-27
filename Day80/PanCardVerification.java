import java.util.Scanner;
import java.util.regex.Pattern;
public class PanCardVerification {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter pan card number");
        String input = sc.next();

        String regExp = "[A-Z]{3}[PFCHAT][A-Z]{1}[0-9]{4}[A-Z]";

        boolean m = Pattern.matches(regExp, input);

        if(m) 
            
           System.out.println("your pan car number has been noted");
        else 
          
           System.out.println("enter valid pan number");


    }
    
}
