import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileOutputStreamAndInputStream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileInputStream input = new FileInputStream("haritha.txt");
            System.out.println("enter the name of your copy");
            String str = sc.next();
            FileOutputStream outputStream = new FileOutputStream(str+".txt");
            byte a[] = new byte[input.available()];
            input.read(a);
            String str1 = new String(a); //here array converting into string.
            System.out.println(str1);
            String str2 = str1.toUpperCase(); //string converting into the uppercase letters.
            System.out.println(str2);
            byte s[] = str2.getBytes(); //again that string stored in bytes array.
            outputStream.write(s); //here we are writing byte array chacters.
            input.close();
            outputStream.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
