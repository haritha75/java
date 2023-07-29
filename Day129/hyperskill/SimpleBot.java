import java.util.Scanner;

public class SimpleBot {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        name("Aid",2020);
        remindName();
        guessAge();
        count();
        test();
        stop();

    }

    public static void name(String name,int year) {

        System.out.println("Hello! My name is "+name+".");
        System.out.println("I was created in "+year+".");
        System.out.println("Please, remind me your name.");

    }

    public static void remindName() {
        String name = sc.next();
        System.out.println("What a great name you have, "+name+"!");
    }

    public static void guessAge() {

        System.out.println("Let me guess your age.");
        System.out.println("Enter the remaindeers of dividing your age by 3, 5 and 7.");
        int remainder1 = sc.nextInt();
        int remainder2 = sc.nextInt();
        int remainder3 = sc.nextInt();
          
        int age = (remainder1 * 70 + remainder2 * 21 + remainder3 * 15) % 105;

        System.out.println("Your age is "+age+": that's a good time to start programming!");

    }

    public static void count() {

        System.out.println("Now I will prove to you that I can count to any number you want.");

        int count = sc.nextInt();

        for(int i=0;i<=count;i++) {
            System.out.println(i+"!");

        }

    }

    public static void test() {

        System.out.println("Lets test your programming knowledge.");
        System.out.println("Why do we use methods?");

        while(true) {
            System.out.println("1. To repeat a statement multiple times.");
            System.out.println("2. To decompose a program into several small subroutines.");
            System.out.println("3. To determine the execution time of a program.");
            System.out.println("4. To interrupt the execution of a program.");

            int number = sc.nextInt();

            if(number==4) 
               System.out.println("Please, try again.");

            else 
                
               return;    
        }

    }

    public static void stop() {
        System.out.println("Congratulation, have a nice day!");
    }

        

    
}