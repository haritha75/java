import java.util.Scanner;

public class AmazingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!\n");
        printInstructions();

        while (true) {
            System.out.print("Enter a request: ");
            String input = scanner.nextLine().trim();
            if (input.equals("0")) {
                System.out.println("\nGoodbye!");
                break;
            }

            String[] inputParts = input.split(" ");
            if (inputParts.length == 1) {
                long num = parseNatural(inputParts[0]);
                if (num != -1) {
                    printProperties(num);
                }
            } else if (inputParts.length == 2) {
                long start = parseNatural(inputParts[0]);
                long count = parseNatural(inputParts[1]);
                if (start != -1 && count != -1) {
                    printPropertiesList(start, count);
                }
            } else if (inputParts.length == 3) {
                long start = parseNatural(inputParts[0]);
                long count = parseNatural(inputParts[1]);
                if (start != -1 && count != -1) {
                    String property = inputParts[2].toUpperCase();
                    if (isValidProperty(property)) {
                        printPropertiesListFiltered(start, count, property);
                    } else {
                        System.out.println("The property [" + property + "] is wrong.");
                        printAvailableProperties();
                    }
                }
            } else {
                System.out.println("Invalid request! Please enter a valid request.");
            }
        }
    }

    private static void printInstructions() {
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and a property to search for;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
    }

    private static long parseNatural(String numStr) {
        try {
            long num = Long.parseLong(numStr);
            if (num < 0) {
                System.out.println("The number should be natural (non-negative).");
                return -1;
            }
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a natural number.");
            return -1;
        }
    }

    private static boolean isValidProperty(String property) {
        return property.equals("EVEN") ||
                property.equals("ODD") ||
                property.equals("BUZZ") ||
                property.equals("DUCK") ||
                property.equals("PALINDROMIC") ||
                property.equals("GAPFUL") ||
                property.equals("SPY");
    }

    private static void printAvailableProperties() {
        System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY]");
    }

    private static void printProperties(long num) {
        System.out.println("\nProperties of " + num);
        System.out.println("        buzz: " + isBuzz(num));
        System.out.println("        duck: " + isDuck(num));
        System.out.println(" palindromic: " + isPalindromic(num));
        System.out.println("      gapful: " + isGapful(num));
        System.out.println("         spy: " + isSpy(num));
        System.out.println("        even: " + isEven(num));
        System.out.println("         odd: " + isOdd(num));
    }

    private static boolean isEven(long num) {
        return num % 2 == 0;
    }

    private static boolean isOdd(long num) {
        return num % 2 != 0;
    }

    private static boolean isBuzz(long num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    private static boolean isDuck(long num) {
        return String.valueOf(num).contains("0");
    }

    private static boolean isPalindromic(long num) {
        String numStr = String.valueOf(num);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }

    private static boolean isGapful(long num) {
        if (num < 100) {
            return false;
        }
        String numStr = String.valueOf(num);
        int firstDigit = Character.getNumericValue(numStr.charAt(0));
        int lastDigit = Character.getNumericValue(numStr.charAt(numStr.length() - 1));
        int concatNum = firstDigit * 10 + lastDigit;
        return num % concatNum == 0;
    }

    private static boolean isSpy(long num) {
        String numStr = String.valueOf(num);
        long sum = 0;
        long product = 1;
        for (char digit : numStr.toCharArray()) {
            int value = Character.getNumericValue(digit);
            sum += value;
            product *= value;
        }
        return sum == product;
    }

    private static void printPropertiesList(long start, long count) {
        for (long i = start; i < start + count; i++) {
            printNumberProperties(i);
        }
    }

    private static void printNumberProperties(long num) {
        System.out.print("\n" + formatNumber(num) + " is");
        if (isBuzz(num)) {
            System.out.print(" buzz,");
        }
        if (isDuck(num)) {
            System.out.print(" duck,");
        }
        if (isPalindromic(num)) {
            System.out.print(" palindromic,");
        }
        if (isGapful(num)) {
            System.out.print(" gapful,");
        }
        if (isSpy(num)) {
            System.out.print(" spy,");
        }
        if (isEven(num)) {
            System.out.print(" even,");
        }
        if (isOdd(num)) {
            System.out.print(" odd,");
        }
    }

    private static void printPropertiesListFiltered(long start, long count, String property) {
        for (long i = start, printed = 0; printed < count; i++) {
            if (matchesProperty(i, property)) {
                printNumberProperties(i);
                printed++;
            }
        }
    }

    private static boolean matchesProperty(long num, String property) {
        switch (property) {
            case "EVEN":
                return isEven(num);
            case "ODD":
                return isOdd(num);
            case "BUZZ":
                return isBuzz(num);
            case "DUCK":
                return isDuck(num);
            case "PALINDROMIC":
                return isPalindromic(num);
            case "GAPFUL":
                return isGapful(num);
            case "SPY":
                return isSpy(num);
            default:
                return false;
        }
    }

    private static String formatNumber(long num) {
        return String.format("%,d", num);
    }
}

