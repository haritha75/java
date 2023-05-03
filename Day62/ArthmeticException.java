import java.util.Scanner;

public  class ArthmeticException {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("hello world!");

        try {
            int a=5/sc.nextInt();
        }
        catch(ArithmeticException e){ //if you give wrong input it will not handling because it will catch only arthmetic errors.

            System.out.println("it will handle only arthmetic exception erros not all exceptions.");
        }

        System.out.println("rock man!");
        System.out.println("hi everyone!");
        

    }
}