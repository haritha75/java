//if exception occurs or not it will excute its statements.
import java.util.InputMismatchException;
import java.util.Scanner;
public class FinallyBlock {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        

        try {

            int a=5/sc.nextInt();

        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("it will catch array outof bound exception only.");

        }
        catch(InputMismatchException e) {

            System.out.println("it catch only  input mismatch errors");


        }

        finally { //it will excute or run after finding catch block if exception occurs otherwise it will excute directly.if not find catch block it will not excute.
            System.out.println("whaterver happening it will excuting the statements.that means if exception or not it will run.");
        }
    }
    
}
