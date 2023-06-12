import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutputStream2 {

    public static void main(String[] args) {
        
        try {
            FileOutputStream fos = new FileOutputStream("fox.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String str = "haritha";
            byte a[] = str.getBytes(); //creating byte array 
            
            bos.write(a);
            fos.flush();
            bos.flush();
            
            fos.close();
            bos.close();
            
            System.out.println("Reached");

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
