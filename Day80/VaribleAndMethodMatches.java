import java.util.regex.Pattern;
import java.util.Scanner;

public class VaribleAndMethodMatches {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        String  regExp = "[^\\dA-Z~`!@#%^&*()-+={}<>\\[\\]/?\\[\\].|;:,\"'/][\\w$]*"; //\\w means a-zA-Z0-9_

        boolean res;
        do {

            System.out.println("enter  varible name");
            String input = sc.next();
            res = Pattern.matches(regExp, input);
            if(res) 
            
               System.out.println("your entered correct varible name");
           else 
          
              System.out.println("enter valid varible name");




        }while(!res);

    }
    
}
