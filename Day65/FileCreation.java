
import java.io.File;
import java.io.IOException;

//whenever you do the operation on a file or folder that time it occurs.
public class FileCreation {

    public static void main(String[] args)  throws IOException{
        
          File f = new File("mock.txt");

          f.createNewFile(); //it is used creating new file
          
          if(f.exists()) 

             System.out.println("true");
          else 
          
             System.out.println("false");
    }
    
}
