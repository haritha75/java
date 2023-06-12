import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStream1 {
    public static void main(String[] args) {
        try {
        
        FileInputStream fis = new FileInputStream("Rock.txt");
        FileInputStream fis1 = new FileInputStream("Fork.txt");
        SequenceInputStream sis = new SequenceInputStream(fis, fis1); //if you want to read two files  then use this one.

        int j; //j=sis.read();
        while((j=sis.read())!=-1) {
            System.out.print((char)j);

        }
        sis.close();
        fis.close();
        fis1.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
