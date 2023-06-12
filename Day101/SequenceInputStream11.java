import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputStream11 {
    public static void main(String[] args) {
        try {
        
        FileInputStream fis = new FileInputStream("Rock.txt");
        FileInputStream fis1 = new FileInputStream("Fork.txt");
        SequenceInputStream sis = new SequenceInputStream(fis, fis1); //if you want to read two files  then use this one.
        FileOutputStream fos = new FileOutputStream("Nock.txt");
         
        int j; //j=sis.read();
        while((j=sis.read())!=-1) {
            System.out.print((char)j);
            fos.write((char)j);

        }
        sis.close();
        fis.close();
        fis1.close();
        fos.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
