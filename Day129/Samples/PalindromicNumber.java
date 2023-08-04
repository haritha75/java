import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromicNumber {
    static String number;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");

        while (true) {
            System.out.println("Enter a request: ");
            if (!isValidNumber()) {
                continue;
            }

            long count = Long.parseLong(number);
            if (count == 0) {
                break;
            }

            System.out.println("Properties of " + number);
            System.out.println("        even:       " + isEven());
            System.out.println("        odd:        " + isOdd());
            System.out.println("        buzz:       " + isBuzzNumber());
            System.out.println("        duck:       " + isDuck());
            System.out.println("        palindromic: " + isPalindrome());
        }

        System.out.println("Goodbye!");
    }

    private static boolean isValidNumber() {
        try {
            long num = scanner.nextLong();
            if (num < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                return false;
            }
            number = Long.toString(num);
        } catch (InputMismatchException e) {
            System.out.println("The first parameter should be a natural number or zero.");
            scanner.nextLine();
            return false;
        }

        return true;
    }

    private static boolean isEven() {
        return Long.parseLong(number) % 2 == 0;
    }

    private static boolean isOdd() {
        return Long.parseLong(number) % 2 != 0;
    }

    private static boolean isBuzzNumber() {
        long num = Long.parseLong(number);

        if (num % 7 == 0 || num % 10 == 7) {
            return true;
        }

        return false;
    }

    private static boolean isDuck() {
        if (number.equals("0")) {
            return false;
        }

        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                return true;
            }
        }

        return false;
    }

    private static boolean isPalindrome() {
        StringBuilder sb = new StringBuilder(number);
        return number.equals(sb.reverse().toString());
    }
}

