import java.io.File;
import java.io.IOException;
import java.util.Scanner;


import java.io.File;
        import java.io.IOException;
        import java.util.Scanner;
public class ScannerTypeReader111 {


    public static void main(String[] args)throws IOException {

        File file = new File("vox.txt");
        Scanner sc =new Scanner(file); //here scanner takes input as a vox.txt file.

        int i = 0;
        while(sc.hasNext()) { //here also checking each char next available or not if not loop stop.

            System.out.print(sc.next()+" "); //here printing every next char or calling every next char.
            i++;
        }

        sc.close();

    }
}
