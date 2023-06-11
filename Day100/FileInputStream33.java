import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStream33 {
    public static void main(String[] args) {

        try {
            InputStream input = new FileInputStream("haritha.txt");
            byte array[] = new byte[input.available()];
            input.skip(3);
            System.out.println((char)input.read());
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
