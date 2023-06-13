import java.io.File;

public class FileEx {

    public static void main(String[] args) {
        try {

        File f = new File("Fork.txt","rw"); //whenever file mention it will not create file in folder it will created in jvm only.
        f.createNewFile(); //whenever we write createnewfile  method then it will created file in the folder.
        
        }
        catch(Exception e) {
            System.out.println(e.getMessage());

        }


    }
    
}
