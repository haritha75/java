import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ScannerReader {


    public static void main(String[] args)throws IOException {

        File file = new File("vox.txt");
        Scanner sc =new Scanner(file); //here scanner takes input as a vox.txt file.

        int i= 0;
        while(sc.hasNext()) {
             String str = sc.nextLine();
            System.out.println(str);
            i++;
        }

        sc.close();

    }
}
