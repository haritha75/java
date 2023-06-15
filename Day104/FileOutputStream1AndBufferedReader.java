import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
//here we are write text file it contains text data or string not binary file.
public class FileOutputStream1AndBufferedReader {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("Rock.txt"); //it takes  one bytes at a time
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos)); //it takes characters so type cssting it.
 //here  bufferedwriter accept only characters.
            bw.write(66);
            bw.write('h');
            bw.write("haritha");
            bw.close();
            fos.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}