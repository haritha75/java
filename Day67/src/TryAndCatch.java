import java.io.*;

public class TryAndCatch {

    public static void main(String[] args) {

        File file = new File("haritha11.txt");


         try {
             Writer writer =  new PrintWriter(System.out); //here we are write the content or data in the console board.

             writer.write("rock the show\n");
             writer.write(97);
             writer.flush(); //it means to clear the writer of any element that may or may not inside the writer.
             writer.close();

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
