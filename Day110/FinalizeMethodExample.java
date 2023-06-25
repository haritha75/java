import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DatabaseMetaData;
//here,student class  have file and database connections also whenever reference variable null that means objects are not pointing to the reference variable then objects and reference variables removed from the memeory but file and database connections not removed so garbage collector before removing the object it calls fib=nalize method that method close the connnections.
import javax.imageio.stream.FileImageInputStream;

public class FinalizeMethodExample {

    public static void main(String[] args) throws FileNotFoundException {

        Student s = new Student();
        System.out.println(s);
        Student s1 = new Student();
        System.out.println(s1);

        s=null;
        s1=null;
        

      

    }

    
}
class Student{

    FileInputStream f = new FileInputStream("Rock.txt");
    DatabaseMetaData d = new DatabaseMetaData() {
     
    };


    static int id;

    Student() throws FileNotFoundException {

        id = id+1;
        System.out.println("id");
    }
@Override 
protected void finalize() throws Throwable {

    f.close();
    d.close();
}

}