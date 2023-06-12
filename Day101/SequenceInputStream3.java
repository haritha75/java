import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream3 {

    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("Rock.txt");
            FileInputStream fis1 = new FileInputStream("Fork.txt");
            FileInputStream fis2 = new FileInputStream("duck.txt");

            Vector v = new Vector(); //if you want read more thant two files then use like this.
            v.add(fis);
            v.add(fis1);
            v.add(fis2);

            Enumeration e = v.elements();

            SequenceInputStream sis = new SequenceInputStream(e);
            int i=0;
            while((i=sis.read())!=-1) {

                System.out.print((char)i);


            }
            fis.close();
            fis1.close();
            fis2.close();
            sis.close();

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
