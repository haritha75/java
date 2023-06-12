import java.io.BufferedInputStream;
import java.io.FileInputStream;
//when buffereinputstream is created, internal buffer array is created.
//it is used to read information from the stream and it internally uses buffer mechanism to make the performance fast.
public class BufferedInoutStream1 {

    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("Rock.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while((i=bis.read())!=-1) {
                System.out.print((char)i);
            }
            fis.close();
            bis.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
