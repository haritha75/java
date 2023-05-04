import java.util.Scanner;
public class ArithmeticException11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try {
            int a=4/sc.nextInt(); //if you not getting where is the exception occurs then in output it shows what type of exception and which line also and check once.
        }
        catch(ArithmeticException e) {

            System.out.println(e.getMessage()); //calling the function with help of object
        }
        System.out.println("whenever catch the exception then object created  and calling the function with the help of object and return the value or message.");
    }
}
