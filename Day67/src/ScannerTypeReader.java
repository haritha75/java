import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTypeReader {

    public static void main(String[] args)throws IOException {

        File  file = new File("vox.txt");
        Scanner sc =new Scanner(file); //here scanner takes input as a vox.txt file.

        //Scanner sc = new Scanner(new File("vox.txt"));//here we are directly take the file.also use like this.
        while(sc.hasNext()) { //here also checking each char next available or not if not loop stop.

            System.out.println(sc.next()); //here printing every next char or calling every next char.
        }

        sc.close();

    }
}
