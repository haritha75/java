import java.io.File;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class TryWithResourceState {

    public static void main(String[] args) {

        File file = new File("haritha11.txt");


        try(Writer writer =  new PrintWriter(System.out); //it print in console board
            Writer writer1 = new PrintWriter(file); //it print in file
        ) // it is used to without using flush and close it automatically handles.it handles writer class.writer class handlers flush and close interfaces.
        {

            writer.write("rock the show\n");
            writer.write(97);
            writer1.write(99);


        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
