
import java.util.Scanner;
import java.util.regex.Pattern;
public class PanCard {


    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);
        
        String regExp = "[A-Z]{3}[PFCHAT][A-Z]{1}[0-9]{4}[A-Z]";

        boolean res; int wait =1000;
        int start = 0;
        do {

            System.out.println("enter pan card number");
            String input = sc.next();
            res = Pattern.matches(regExp, input);
            if(res) 
            
               System.out.println("your pan car number has been noted");
           else {
          
              System.out.println("enter valid pan number");
              start++;
              if(start>=5) {
                int time = wait/1000;
                int time1 = time;
                
                for(int i=0;i<time;i++){

                System.out.println("try again "+time1+"seconds");
                time1--;
                Thread.sleep(1000); 
                }
                wait *= 2;

              }

           }




        }while(!res);

        

    }
    
}
