import java.io.CharArrayReader;

public class CharArrayInputStream11 {

    public static void main(String[] args) {
        
        try {
            char a[]  = {'a','b','c','d','f','h'};

        CharArrayReader cr = new CharArrayReader(a);

        int x;
        while((x=cr.read())!=-1) {
            System.out.println((char)x);
        }
        cr.close();


        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
