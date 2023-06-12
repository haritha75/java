import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStream1 {

    public static void main(String[] args) {
         try {
            FileOutputStream fos = new FileOutputStream("Joke.txt");
            FileOutputStream fos1 = new FileOutputStream("Shock.txt");

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bos.write(65);
            bos.writeTo(fos);
            bos.writeTo(fos1);

            fos.close();;
            fos1.close();
            bos.close();
            
         }
         catch(Exception e) {
            System.out.println(e.getMessage());
         }
    }

    
    
}
