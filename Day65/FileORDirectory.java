import java.io.File;
import java.io.IOException;

public class FileORDirectory
 {

    public static void main(String[] args) throws IOException{
        
         File f = new File("mock.txt");
           System.out.println(f.isFile()); //it return boolean value 
           System.out.println(f.isDirectory()); //it return boolean true or false
           System.out.println( f.getAbsoluteFile()); //give total path
           System.out.println(f.getPath()); //file current path name
           System.out.println(f.getName()); //give file name
           System.out.println(f.length());
           
    }
    
}
