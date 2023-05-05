
//when give wrong input that time it occurs
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatchException11 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
      
       
        try {

        int x = 5/sc.nextInt();

        }

        catch(InputMismatchException e) {
            
            System.out.println(e.getMessage());
        }

    }
    
}
