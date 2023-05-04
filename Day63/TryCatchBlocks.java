//if one exception catch then it will not come back again it will excute next statements only like else if statements type if one statement correct then it will not check next statement it print directly.
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchBlocks {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a1[]=new int[5];

        try{
            int a=5/sc.nextInt();

            System.out.println(a1[9]);
        }
        catch(InputMismatchException e) {

            System.out.println(e);
        }


        catch(ArithmeticException e) {
            System.out.println("it handle only arithmetic exceptions");
        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
        }


        System.out.println("hello, it will print if  you handle the exceptions properly ");
    }
}
