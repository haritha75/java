import java.util.regex.Pattern;
import java.util.Scanner;

public class VaribleAndMethodMatches {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        boolean res1 = Pattern.matches("[^\\dA-Z]{1}[a-zA-z0-9_$\\S]*", "variableDeclaration");
        System.out.println(res1);

        String  regExp = "[^\\dA-Z@#!%^&*()]{1}[a-zA-Z0-9$_\\S]*"; //[^\\dA-z&!()^*]{1}[\\w\\S$]*

        boolean res;
        do {

            System.out.println("enter  varible name");
            String input = sc.next();
            res = Pattern.matches("regExp", "input");
            if(res) 
            
               System.out.println("your entered correct varible name");
           else 
          
              System.out.println("enter valid varible name");




        }while(!res);

    }
    
}
