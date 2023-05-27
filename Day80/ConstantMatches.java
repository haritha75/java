import java.util.regex.Pattern;

import java.util.Scanner;
public class ConstantMatches {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String regExp = "[A-Z]{1}[A-Z_]*";
        boolean res;
        do {

            System.out.println("enter constant varible name");
            String input = sc.next();
            res = Pattern.matches(regExp, input);
            if(res) 
            
               System.out.println("your entered correct varible name");
           else 
          
              System.out.println("enter valid vsairble name");




        }while(!res);

    }
    
}
