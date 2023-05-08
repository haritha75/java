import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter12 {

    public static void main(String[] args)throws IOException {


        File file = new File("animal.txt"); //if you have file not created otherwise it create new file
        FileWriter fileWriter = new FileWriter(file,true); //
        fileWriter.write("this content will be stored in  the joker.txt file \n");
        fileWriter.write("rock the man"); //first one replaced with this content. if you have total content then use append.
        fileWriter.close();
    }
}
