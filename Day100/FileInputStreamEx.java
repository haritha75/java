import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamEx {

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("haritha.txt");
        System.out.println((char)input.read()); //whenever read the file each time it will print one character only.and that character removed from the file.
        System.out.println((char)input.read());

        System.out.println(input.available()); //it returns number of characters in the file.here, each character consider a  one byte.
        //if you want read all characters or bytes at time use like this
        byte array[]=new byte[input.available()]; //first creating byte array size is how many characters are in the file that will be the size or length
        input.read(array); //total file read and stored into the array.whenever reading all characters that all removed from the file and in that file count will be zero.
        String str = new String(array); //array will be converting into string.
        System.out.println(str); //here print only few character because already means in above we are reading two characters so that two characters removed from the file remaining will be printed here.
        input.close();
    }
}
