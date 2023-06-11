import java.io.FileOutputStream;

public class FileOutputStreamEx1 {
    public static void main(String[] args) {

        try {
            FileOutputStream output = new FileOutputStream("Mock.txt"); //if you not having the file it  will created.
            String str = "hello everyone!"; //if you want to store all characters at a time use like this.
            byte a[] = str.getBytes(); //converting string into byte array
            output.write(a); //writing whatever in the byte array into the file.
            output.close();

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
