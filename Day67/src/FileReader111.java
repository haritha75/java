import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;
public class FileReader111 {


    public static void main(String[] args) throws IOException {


        File file = new File("vox.txt");
        FileReader fileReader = new FileReader(file);

          int x = fileReader.read();
          while(x!=-1) { // check the condition until -1 it will stop otherwise it check the condition and print the char value and again read the char every time.

              System.out.print((char)x);
              x = fileReader.read(); //again the read the next char
          }

        fileReader.close();

    }
}
