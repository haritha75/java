import java.io.ByteArrayInputStream;

public class BytearrayInputStream23 {
    public static void main(String[] args) {
        
        try {
            byte a[] = {'a','b','c','d'};

            ByteArrayInputStream bos = new ByteArrayInputStream(a);
            System.out.println(bos.markSupported());
            bos.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage()); //it return if it supports otherwise returns false.
        }
    }
    
}
