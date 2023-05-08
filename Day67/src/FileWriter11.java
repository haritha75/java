import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter11 {

    public static void main(String[] args) throws IOException {

        File file = new File("/home/haritha/Documents/GitHub/java/Day67/Files/src/joccker.java"); //it creates new file or if you have already then not created

        FileWriter fileWriter = new FileWriter(file);
          fileWriter.write("hello everyone!"); //here, we are writing the content in joccker file
          fileWriter.close(); //it must and should if use filewriter function


    }
}
