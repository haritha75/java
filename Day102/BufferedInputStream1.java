import java.io.BufferedInputStream;
import java.io.FileInputStream;
//whenever use input and out streams it will read and write bytes not characters,
public class BufferedInputStream1 {

    public static void main(String[] args) {
        
        try {

            FileInputStream fis = new FileInputStream("Rock.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            System.out.println((char)bis.read());
            System.out.println((char)bis.read());

            bis.mark(4); //marked will be third possition whenever reset the file that time it will print in this position.

            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            bis.reset();
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());

            fis.close();
            bis.close();



        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}