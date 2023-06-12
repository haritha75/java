import java.io.ByteArrayInputStream;
//it performs input and output operations 8bits bytes.
public class ByteArrayInputStream1 {
    public static void main(String[] args) {
        try {
        
        byte a[] = {'a','b','c'};
        byte b[] = {65,66,68};
        ByteArrayInputStream bis = new ByteArrayInputStream(a);

        // System.out.println(bis.read());
        // System.out.println(bis.read());
        
int x;
        while((x=bis.read())!=-1) {
            System.out.println((char)x);
        }
        String str = new String(bis.readAllBytes()); //it read all bytes at a time.
        System.out.println(str);

        bis.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
