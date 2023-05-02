//if runtime exception happening on that time you get only few statements not all if you have remaining statements also use try and catch blocks.

import java.util.Scanner;
public class TryCatchException {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);


        System.out.println("compiletime");
        System.out.println("runtime");
        
       try {

        int a=sc.nextInt(); //here ,if you enter wrong input i mean not input type then it show input mismatch and also excute next statements also.that's why you are using try and catch blocks.
        System.out.println(a);


       }

       catch(Exception e) {

        System.out.println(e);
       }

        System.out.println("arthmetic exception");
        System.out.println("wrong input");


    }
    
}
