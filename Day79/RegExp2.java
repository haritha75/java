import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;
public class RegExp2 {

    public static void main(String[] args) {
        
        Pattern a = Pattern.compile(".+@gmail.com$");
        Matcher m;

        Scanner sc = new Scanner(System.in);

        do {

         System.out.println("enter e-mail:");

         String  mail = sc.next();

         if(mail.length() <11) {

            System.out.println("enter correct mail");
         }

         m = a.matcher(mail); 

        }while(!m.matches());
        
        System.out.println("finally you entered correct e-mail");


        
    }
    
}
