//here wecan use multiple catch blocks and also try blocks also if you want use it.

import java.util.InputMismatchException;
import java.util.Scanner;

public class AllException {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a[]=new int[7];
        
        System.out.println("hlo guys");
        System.out.println("once exception occurs it will search for catch block then it will not come back again it will proceed next process or statements");

        try {

            int a1=5/sc.nextInt();
            //here it will not check if above statement enter wrongly it will search for the catch block then not come back again.excute next statemetns.


        }

        catch(ArithmeticException e) {

            System.out.println("it handles only arthmetical errors");

        }

        catch(InputMismatchException e) {

            System.out.println("it handles only input mismatch erros");
        }

        try {

        System.out.println(a[10]); 
        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("it will catch only array outof bounds errors");
        }

        System.out.println("after erors will be catched then remaining statements also excuted");
    }
    
}
