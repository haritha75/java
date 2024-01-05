import java.util.Scanner;

public class FactorialOfN {

    static int factorial(int n) {
      
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Calculating factorial
        int result = factorial(number);

        // Displaying the result
        System.out.println("The factorial of " + number + " is " + result);

        // Closing the scanner
        scanner.close();
    }
}
