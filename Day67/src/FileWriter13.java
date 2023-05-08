import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter13 {

    public static void main(String[] args) throws IOException {


        File file = new File("duck.txt");

        FileWriter fileWriter = new FileWriter(file);
       // FileWriter fileWriter1 = new FileWriter(new File("duck.txt"),true); //use like this also.if you comfort.

        fileWriter.write("good morning!\n");
        fileWriter.append("good night!"); //here, we are adding this content to the file.
        fileWriter.close(); //it must to close
    }
}
