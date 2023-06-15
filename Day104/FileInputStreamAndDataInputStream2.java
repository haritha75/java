import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.imageio.stream.FileImageInputStream;

public class FileInputStreamAndDataInputStream2 {
    public static void main(String[] args) {
        
        try {

            FileInputStream fis = new FileInputStream("weight.txt");
            DataInputStream dis = new DataInputStream(fis);

            int len = dis.readInt(); //we know in that file first line containing int type length.so that why we read that one.

            for(int i=0;i<len;i++)

            System.out.println(dis.readDouble()); //here reading values

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
