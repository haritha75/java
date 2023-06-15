import java.io.DataInputStream;
import java.io.FileInputStream;


public class FileInputStreamAndDataInputStream {

    public static void main(String[] args) {
        
        try {

            FileInputStream fis = new FileInputStream("Shock.txt");

            DataInputStream dis = new DataInputStream(fis);
//here, we read all type of variables because we are connect fileinputstream to datainputstream.datainputstream read all type of types.
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());

            dis.close();
            fis.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
