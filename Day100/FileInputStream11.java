import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStream11 {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("haritha.txt");
            byte array[] = new byte[input.available()];
            input.read(array); //whatever in the input variable that will read and storing into the array.
            String str = new String(array);
            System.out.println(str);
            input.close();

        }
        catch(Exception e) {
            e.getStackTrace();

        }
    }
}
