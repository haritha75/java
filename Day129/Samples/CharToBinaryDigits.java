import java.util.Scanner;

public class CharToBinaryDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String str = scanner.nextLine();

        System.out.println("The result:");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String binaryRepresentation = String.format("%7s", Integer.toBinaryString(c)).replace(' ', '0');
            System.out.println(c + " = " + binaryRepresentation);
        }
    }
}

