import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamEx {

    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("duck.txt");
            DataInputStream sts = new DataInputStream(fis);

            HDFC h = new HDFC(sts.readUTF());
            h.setBalance(sts.readDouble());
            h.setMinimumBal(sts.readInt());

            System.out.println(h.getName());
            System.out.println(h.getBalance());
            System.out.println(h.getMinimumBal());

            fis.close();
            sts.close();

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
