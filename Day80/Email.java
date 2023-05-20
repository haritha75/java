import java.util.regex.Pattern;
import java.util.Scanner;
public class Email {

    public static void main(String[] args)throws InterruptedException  {
        Scanner sc = new Scanner(System.in);
        String  email = "^\\D[0-9$#&@a-z]{7,33}@gmail.com$"; //"^\\D[0-9a-z]{5,29}@[a-z]{3,10}[.][a-z]{2,3}";
        boolean res; int wait =1000;
        int start = 0;
        do {

            System.out.println("enter pan card number");
            String input = sc.next();
            res = Pattern.matches("email", "input");
            if(res) 
            
               System.out.println("your email has been noted");
           else {
          
              System.out.println("enter valid mail ");
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

        

    