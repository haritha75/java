import java.util.Scanner;

public class CalculatorSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Exponentiation");

        System.out.print("Enter your choice (1-6): ");
        int choice = Integer.parseInt(scanner.nextLine());

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            case 6:
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println(num1 + " " + choice + " " + num2  + " = " + result);
    }
}