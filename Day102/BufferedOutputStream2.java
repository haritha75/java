import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
//whenever use input and out streams it will read and write bytes not characters,

public class BufferedOutputStream2 {

    public static void main(String[] args) {
        
        try{

            FileOutputStream fos = new FileOutputStream("Mock.txt");

            BufferedOutputStream bos =  new BufferedOutputStream(fos);
            String s = "haritha";
            byte a[] = s.getBytes();

            bos.write(a);
            fos.flush();
            bos.flush();
            fos.close();
            bos.close();
            System.out.println("success.....");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
