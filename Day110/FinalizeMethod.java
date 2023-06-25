//whenever object removed from the heap some connection also after removing the object like file and database connection if you remove or clean that type of connnection garbage collector calling the finalize method for cleaup  this type of activities.
import java.io.File;

public class FinalizeMethod {

    private File file;

    public FinalizeMethod(String filename) {

        this.file = new File(filename);
    }
    FinalizeMethod() {

    }
    @Override
     protected void finalize() throws Throwable {

        try {

            if(file != null) {
                file.close();

            }
        }
        finally {

            super.finalize();
        }
     }

    
}
