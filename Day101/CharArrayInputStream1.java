import java.io.CharArrayReader;
import java.io.IOException;
//it perform input and output operations of 16 bits unicode.
public class CharArrayInputStream1 {


    public static void main(String[] args) throws IOException {
        
        char a[]  = {'a','b','c','d','f','h'};

        CharArrayReader cr = new CharArrayReader(a);

        System.out.println((char)cr.read());
        System.out.println((char)cr.read());
       
        cr.mark(1); //it means after two characters reading we marked 3 characters whenever using reset then it start from mark characters.
        System.out.println((char)cr.read());
        System.out.println((char)cr.read());
        cr.reset();
        System.out.println((char)cr.read());
        System.out.println((char)cr.read());
        System.out.println((char)cr.read());
        cr.close();
    



    }
}

