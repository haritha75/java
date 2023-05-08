import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader11 {

    public static void main(String[] args) throws IOException {


        File file = new File("vox.txt");
        FileReader fileReader = new FileReader(file);

        System.out.println(fileReader.read()); //every time it read the character and returns the ascii value
        System.out.println(fileReader.read());
        System.out.println((char)fileReader.read()); //if you have the character then convert char type
        System.out.println((char)fileReader.read());


        fileReader.close();

    }
}
