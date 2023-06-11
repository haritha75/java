import java.io.FileInputStream;
import java.io.InputStream;
//inputStream is parent class and FileinputStream is a subclass.
public class FileInputStream5 {
    public static void main(String[] args) {

        try {
            InputStream input = new FileInputStream("haritha.txt");
            int data = input.read();
            while(data!=-1) { //this is another method reading and printing all the characters.
                System.out.print((char)data);
                data = input.read();
            }
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
