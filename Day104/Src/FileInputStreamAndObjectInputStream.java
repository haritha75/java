import java.io.FileInputStream;
import java.io.ObjectInputStream;
//deserilization is a process of converting  byte stream to object. it  will do jvm.
//it is a deserilization.
//if you want read same text in different folder then we must same files name,s methods and class names also.whatever in that file in same use in this also.if not use same it will work properly.if you have same that time only serialUID will be matched otherwise not.
public class FileInputStreamAndObjectInputStream {

    public static void main(String[] args) {
        
        try {

            FileInputStream fis = new FileInputStream("Duck.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            SoftwareEngineer se = (SoftwareEngineer) ois.readObject(); //here we are type casting whatever we read.here reading total object.
            System.out.println(se);


            System.out.println(se.getName());
            System.out.println(se.getAge());
            System.out.println(se.getWeight());
            se.sayHi(); //here not only  read variables data also read methods.
             se.hi(10000);

            ois.close();
            fis.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
