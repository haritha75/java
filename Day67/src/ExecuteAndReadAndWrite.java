import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ExecuteAndReadAndWrite {

    public static void main(String[] args)throws IOException {

        File file = new File("deer.txt");

        file.createNewFile();
        System.out.println(file.canExecute()); //it returns boolean value file execute are not i means if you want execute the file in permissions you change the option to execute.i mean allow the file for execution.
        System.out.println(file.canRead()); //it returns file can read or not.if you have only read option then make in permission not allow write option allow only read option.if you have only read option that time file not allowing to write something.
        System.out.println(file.canWrite()); //it returns file write are not.if you have write option then in permissions make allow option then write the something in file.
        System.out.println(new Date(file.lastModified())); // it returns date of last modification of  file .
        System.out.println(file.compareTo(new File("mock.txt"))); //it compares the paths of two files.if same files name it returns 0 otherwise compare first letter of both files if same then go to next letter if different then return ascii value.
        System.out.println(file.equals(new File("deer.txt"))); //it checks same file or not.even same content in the other file also returns false.

    }
}
