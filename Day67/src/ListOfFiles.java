import java.io.File;
import java.io.IOException;

public class ListOfFiles {

    public static void main(String[] args) {


        File file = new File("/home/haritha/Documents/GitHub/java/Day67/Files/src/");


            for (var x : file.list()) {
                System.out.println(x);
            }

    }
}
