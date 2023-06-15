import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FileOutputStreamAndDataOutputStream2 {

    public static void main(String[] args) {
        
        try {

            FileOutputStream fos = new FileOutputStream("weight.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            double weights[] = {4.76,8.97,9.67,3.23};

            dos.writeInt(weights.length); //here first we are written length type is int in that file.nased on that we are reading the data.

            for(int i=0;i<weights.length;i++) {
                dos.writeDouble(weights[i]); //then we are written double values in that file.
            }
            dos.close();
            fos.close();
              
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
