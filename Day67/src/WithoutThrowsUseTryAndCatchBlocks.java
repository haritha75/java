import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//here without throws  the exception use try and catch block and catch or handle exception
public class WithoutThrowsUseTryAndCatchBlocks {

    public static void main(String[] args) {

        File file = new File("haritha.txt");


        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("rock the show");
            fileWriter.flush(); //must
            fileWriter.close(); //must
            FileWriter f1 = new FileWriter(new File("shock.txt"));
            f1.write("shock");
            f1.flush(); // when you read or  write  file evey time or every file close and flush.
            fileWriter.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
