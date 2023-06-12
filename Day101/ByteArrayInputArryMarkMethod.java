import java.io.ByteArrayInputStream;

public class ByteArrayInputArryMarkMethod {

    public static void main(String[] args) {
        
        byte a[]  = {'a','b','c','d','f','h'};

        ByteArrayInputStream  bis = new ByteArrayInputStream(a);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
       
        bis.mark(1); //it means after two characters reading we marked 3 characters whenever using reset then it start from mark characters.
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
    }
    
}
