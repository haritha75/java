import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class FileInputStreamAndOutPutStream2 {

    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("Rock.txt");
            FileOutputStream fos = new FileOutputStream("Fork.txt");

            int x = fis.available();
            while(x-->0) {
                char y = (char)fis.read(); //it will read the character untill x will be 0.
                if(y==' ') 
                    fos.write(y);
                else 
                    fos.write(y-32);    
            }
            fis.close();
            fos.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
