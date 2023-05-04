
import java.util.Scanner;
public class Thows {
    

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        rock(5,0); //here first calling the function and rock function also calling divide function and then go to the divide method it check the exception and  we are throw the exception and it will search for that  catch block exception.
    }
    static int rock(int c,int d) throws ArithmeticException { //here we throw  arithmetic exception if you not find the exception .here, divide method called by the rock function so rock method also catch the exception. and also one more thing is rock function handle by the divide function so that's why we are using throws exception.

        

            int r = divide(c,d);


        return 10;
    }

    static int divide(int a,int b) throws ArithmeticException { //if you not find the exception then divide method calling in rock method so in rock method also mention throws exception type.

        if(b==0) 

           throw new ArithmeticException("/by zero");

       return a/b;   

    }
    
}
