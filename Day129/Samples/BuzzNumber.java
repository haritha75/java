import java.util.Scanner;

public class BuzzNumber {
    static int number;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a natural number:");
        isValidNumber();
        isEvenOrOdd();
        isBuzzNumber();

    }
    private static void isValidNumber() {
        try{
            number = scanner.nextInt();
            if(number>0);
            else {
                System.out.println("This number is not natural!");
            }
        } catch (Exception e){
            System.out.println("This number is not natural!");
        }

    }
    private static void isEvenOrOdd() {
        if(number%2 == 0)
            System.out.println("This number is Even.");
        else
            System.out.println("This number is Odd.");
    }
    private static void isBuzzNumber() {
        if((number%7==0) &&(number%10==7)){
            String res = """
                    It is a Buzz number.
                    Explanation:
                    """;
            System.out.print(res);
            System.out.println(number+" is divisible by 7 and ends with 7.");
        }
        else if((number%7==0)){
            String res = """
                    It is a Buzz number.
                    Explanation:
                    """;
            System.out.print(res);
            System.out.println(number+" is divisible by 7.");
        }
        else if(number%10==7){
            String res = """
                    It is a Buzz number.
                    Explanation:
                    """;
            System.out.print(res);
            System.out.println(number+" ends with 7");
        }
        else {
            String res = """
                    It is not a Buzz number.
                    Explanation:
                    """;
            System.out.print(res);
            System.out.println(number+" is neither divisible by 7 nor does it end with 7.");
        }
    }
}

