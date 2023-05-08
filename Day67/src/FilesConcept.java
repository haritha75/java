import java.io.File;
import java.io.IOException;

public class FilesConcept {

    public static void main(String[] args)throws IOException {

        File file = new File("src/rock.txt"); //here if you mention src folder it create src folder not mention then it  create outside src folder.
        file.createNewFile(); //it actually create the new file.
        System.out.println(file.length()/1000.0); //it returns data in bit wise if you want in kbs use /1000.0
        System.out.println(file.exists()); //it returns boolean value if file is there it returns true otherwise not.
        System.out.println(file.isFile()); //it returns it is file or not in boolean type
        System.out.println(file.isDirectory()); //it is folder or not it returns boolean type.

        System.out.println(file.getAbsoluteFile()); //it returns total path of the file.
        System.out.println(file.getPath()); //it returns current of the file.
        System.out.println(file.getName()); //it returns file name.

       var c= file.renameTo(new File("src/nick.txt")); //here we are changing the file name but content or data same just change file name.
        File f = new File("src/.mock.txt"); //hidden files starts with (.) symbol. and it will not visible in folder if you want in the folder click show hidden files
        System.out.println(f.isHidden()); //it returns it is hidden file or not in boolean type.
        f.renameTo(new File("mock.txt")); //here we converting hidden file to normal txt file.
        System.out.println(f.isHidden()); //it returns false because we are converting  normal txt file.




    }
}
