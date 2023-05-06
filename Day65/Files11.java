

import java.io.File;
import java.io.IOException;

//whenever you do the operation on a file or folder that time it occurs.
public class Files11 {


    public static void main(String[] args)  throws IOException{
        
          File f = new File("rock.txt");

          
          if(f.exists()) {

             System.out.println("true");
             System.out.println("file already there");

                f.delete();
          }
          else {
            System.out.println("file is not there");
            f.createNewFile();
          }
          
    }
    
}
