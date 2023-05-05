import java.util.InputMismatchException;
import java.util.Scanner;
public class AllExceptionWithOR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        int a[] = new int[5];
        Rock r1 = new Rock();
        int start = 0;

        try {
             int x = Integer.parseInt(r1.r); //Number
            
             start = 1;
             int a1 = 5/sc.nextInt(); //arithmetic

             start = 2;
             int c = sc.nextInt(); //input mismatch

             start = 3;
             int  x1 = a[7]; //array out of bounds


             start = 4;        
             int  c1 = r1.r.length(); //null pointer

        }
        catch(NumberFormatException | ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException |NullPointerException e) {

            if(start == 0)
               System.out.println("number format excception");
            if(start == 1) 
               System.out.println("Arithmetic exception");
            if(start == 2)
               System.out.println("input mismatch exception");
            if(start == 3)
               System.out.println("array index out of bound exception");   
            if(start == 4) 
               System.out.println("null pointer exception");   




        }
    }
    
}
class Rock {

    String r = "123" ;
}