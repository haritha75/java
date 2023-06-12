import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;

public class CharArrayWriter22 {

    public static void main(String[] args) {
        
        try {

            CharArrayWriter cw = new CharArrayWriter();
            cw.write(67);

            FileWriter fos = new FileWriter("Cock.txt");
            cw.writeTo(fos);
            cw.close();
            fos.close();

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
