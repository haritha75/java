import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class FileOutStreamAndObjectOutStream1 {

    public static void main(String[] args) {
        

        try {

            SoftwareEngineer se = new SoftwareEngineer();
            se.setName("ramya");
            se.setAge(22);
            se.setWeight(49.8);

            FileOutputStream fos = new FileOutputStream("Duck.txt"); 
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(se);
         
            long serialUID = ObjectStreamClass.lookup(se.getClass()).getSerialVersionUID();
            System.out.println(serialUID); 

            oos.close();
            fos.close();


        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
    
}
