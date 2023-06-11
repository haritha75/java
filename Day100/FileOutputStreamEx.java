import java.lang.annotation.Target;
import  java.io.*;
public class   FileOutputStreamEx {

    public static void main(String[] args) {

        try {
            FileOutputStream output = new FileOutputStream("Rock.txt");
            output.write(65); //whenever write the character that will be stored in file.
            output.close();

        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }


}
