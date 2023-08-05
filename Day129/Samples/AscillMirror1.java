import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AscillMirror1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the file path:");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            if (file.isFile()) {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
                fileScanner.close();
            } else {
                System.out.println("File not found!");
            }
        } else {
            System.out.println("File not found!");
        }
    }
}

