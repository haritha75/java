import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedAndFileReaderEx {

    public static void main(String[] args) {
        

        try {
            FileReader fr = new FileReader("Rock.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println((char)br.read());
            System.out.println((char)br.read());
            System.out.println((char)br.read());

            br.mark(5);

            System.out.println((char)br.read());
            System.out.println((char)br.read());
            br.reset();
            System.out.println((char)br.read());
            System.out.println((char)br.read());

            fr.close();
            br.close();
        
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
