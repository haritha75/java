import java.io.FileInputStream;
import java.io.FileOutputStream;
//in fileinputstream whenever read the character or byte it will be removed from the file again not reading that character because it removed from the file.
public class FileInputStreamAndFileOutputStream {
    public static void main(String[] args) {
        

        try {
            FileInputStream fis = new FileInputStream("Rock.txt");
            FileOutputStream fos = new FileOutputStream("duck.txt");
            int x = fis.available();
            while(x-->0) {
                char y = (char)fis.read(); //it will read the character untill x will be 0.
                if(y==' ') 
                    fos.write(y);
                else 
                    fos.write(y);    
                    
                    fis.close();
                    fos.close();

            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }   
     }
}