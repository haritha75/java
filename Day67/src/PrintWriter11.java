import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter11 {

    public static void main(String[] args) throws IOException {

        File file = new File("vox.txt");

        PrintWriter printWriter = new PrintWriter(file);

           printWriter.println("hari"); //it print the content in each new line
           printWriter.print("haritha");
           printWriter.append("\nteju\nbhavana\n"); //it add the new content to the file
           printWriter.write("hello eveyone!");
           printWriter.close();
    }
}
