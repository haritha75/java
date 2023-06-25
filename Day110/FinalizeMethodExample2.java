import java.io.FileNotFoundException;

public class FinalizeMethodExample2 {
    public static void main(String[] args) throws  Exception{
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3  = new Student();
        s3=null;
        System.gc(); // before destroying an object garbage collector calling the finalize method for cleanup activities, jvm not call the finalize method.
        Runtime.getRuntime().gc();
        Student s4 = new Student();

    }
}
class Student{
    static  int id;
    Student() throws FileNotFoundException {
        id = id+1;
        System.out.println(id);
    }

    @Override
    protected void finalize() throws Throwable {
        id = id-1;
    }
}