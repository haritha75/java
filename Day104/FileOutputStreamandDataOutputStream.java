import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FileOutputStreamandDataOutputStream {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("Shock.txt"); //it takes  one bytes at a time
            DataOutputStream bw = new DataOutputStream(fos); //it takes characters so type cssting it.
//here , dataouputstream accept all types. but it create binary file.
            bw.writeInt(66);
            bw.writeDouble(34.778);
            bw.writeUTF("haritha");
            bw.close();
            fos.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
