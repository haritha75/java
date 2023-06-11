import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStream2 {

    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("haritha.txt");
            byte array[] = new byte[input.available()];
            input.read(array,3,5); //it means text file content will be start from 3 index to 5.example Hello it start H will be print 3 index  and 4 will be e and next 5 will be l remaining not prining.
            System.out.println((char)(array[4]));
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }

    }
}
