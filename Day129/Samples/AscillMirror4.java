package asciimirror;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AscillMirror4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Input the file path:");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            if (file.isFile()) {
                List<String> list = new ArrayList<>();
                int maxLength = 0;

                try {
                    Scanner file1 = new Scanner(file);
                    while (file1.hasNextLine()) {
                        String line = file1.nextLine();
                        list.add(line);

                        if (line.length() > maxLength) {
                            maxLength = line.length();
                        }
                    }
                    file1.close();
                    for(String data : list){
                        System.out.print(data);
                        for(int i=0;i<(maxLength-data.length());i++){
                            System.out.print(" ");
                        }
                        System.out.print(" | "+data);
                        for(int i=0;i<(maxLength-data.length());i++){
                            System.out.print(" ");
                        }
                        System.out.println();
                    }


                } catch (FileNotFoundException e) {
                    System.out.println("File not found!");
                }
            } else {
                System.out.println("File not found!");
            }
        } else {
            System.out.println("File not found!");
        }

    }
}

