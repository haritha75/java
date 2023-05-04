import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTrackTrace {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        

        try {
            int x=5/sc.nextInt();
        }
        catch(InputMismatchException e) {

            System.out.println(e.getMessage());
        }

            catch(Exception e) {
                System.out.println(e.getMessage());
               e.printStackTrace();
            }

            System.out.println("it print which exception occurs");
        
    }
    
}
