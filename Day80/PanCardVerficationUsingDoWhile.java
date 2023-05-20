    

import java.util.Scanner;
import java.util.regex.Pattern;
public class PanCardVerficationUsingDoWhile {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String regExp = "[A-Z]{3}[PFCHAT][A-Z]{1}[0-9]{4}[A-Z]";

        boolean res;
        do {

            System.out.println("enter pan card number");
            String input = sc.next();
            res = Pattern.matches("regExp", "input");
            if(res) 
            
               System.out.println("your pan car number has been noted");
           else 
          
              System.out.println("enter valid pan number");




        }while(!res);

        

    }
    
}
