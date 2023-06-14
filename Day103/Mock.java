import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.sql.DataSource;

public class Mock {

    public static void main(String[] args) {
        

        try {


            FileOutputStream fos = new FileOutputStream("duck.txt");
            DataOutputStream  dos = new DataOutputStream(fos);

            HDFC h = new HDFC("haritha"); //creating object and setting the values and that values written into the duck files.
            h.setBalance(644.54);
            h.setMinimumBal(3000);

            dos.writeUTF(h.getName());
            dos.writeDouble(h.getBalance());
            dos.writeInt(h.getMinimumBal());

            fos.close();
            dos.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
