import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MirrorASCIIArt {

    public static void main(String[] args) {
        // Read the file path from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the file path:");
        String filePath = scanner.nextLine();
        scanner.close();

        // Create a File object using the given file path
        File file = new File(filePath);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        // Create a list to store the lines read from the file
        List<String> lines = new ArrayList<>();
        int maxLength = 0; // Variable to store the length of the longest line

        try {
            // Open the file for reading using a Scanner
            Scanner fileScanner = new Scanner(file);

            // Read the lines from the file and store them in the list
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines.add(line);

                // Update maxLength if the current line is longer
                if (line.length() > maxLength) {
                    maxLength = line.length();
                }
            }
            fileScanner.close();

            // Format and print each line in the list
            for (String line : lines) {
                // Calculate the number of whitespaces needed to make the line the same length as maxLength
                int padding = maxLength - line.length();
                String paddedLine = line + " ".repeat(padding); // Append whitespaces to the end of the line
                String reversedPaddedLine = reverseString(paddedLine); // Reverse the line
                String horizontallyMirroredLine = horizontallyMirror(reversedPaddedLine); // Horizontally mirror the line
                System.out.println(paddedLine + " | " + horizontallyMirroredLine); // Print the modified line
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    // Function to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Function to horizontally mirror a string by replacing symmetrical characters
    private static String horizontallyMirror(String str) {
        StringBuilder mirrored = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Replace characters that are not horizontally symmetrical with their opposites
            switch (ch) {
                case '<':
                    mirrored.append('>');
                    break;
                case '[':
                    mirrored.append(']');
                    break;
                case '{':
                    mirrored.append('}');
                    break;
                case '(':
                    mirrored.append(')');
                    break;
                case '/':
                    mirrored.append('\\');
                    break;
                case '>':
                    mirrored.append('<');
                    break;
                case ']':
                    mirrored.append('[');
                    break;
                case '}':
                    mirrored.append('{');
                    break;
                case ')':
                    mirrored.append('(');
                    break;
                case '\\':
                    mirrored.append('/');
                    break;
                default:
                    mirrored.append(ch); // If the character is symmetrical, add it as it is
            }
        }

        return mirrored.toString();
    }
}

