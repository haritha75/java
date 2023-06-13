import java.io.BufferedWriter;
import java.io.FileWriter;
//whenever use reader and writer it will read and write characters.
public class FileWriterAndBufferedWriter {

    public static void main(String[] args) {
        

        try {
            FileWriter fw = new FileWriter("Duck.txt");

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("haritha");
            bw.close();

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
