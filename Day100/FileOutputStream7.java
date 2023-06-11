import java.io.FileOutputStream;

public class FileOutputStream7 {

    public static void main(String[] args) {

        try {
            FileOutputStream output = new FileOutputStream("Shock.txt");
            String str = "hello everyone!";
            byte a[] = str.getBytes();
            output.write(a,2,6); //it means it write the character from 2 index and 6 characters only remaining not writing.
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
