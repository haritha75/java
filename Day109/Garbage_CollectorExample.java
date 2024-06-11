//gorbage collector worked for whenever the reference variable not pointing to the object then it removed that  object from the heap.it automatically happening in java but not like that in c language.
public class Garbage_CollectorExample {

    public static void main(String[] args) {

        Student s1 = new Student("23","svu");

        Student s2 = new Student("1","jntu");
        Student s3 = new Student("4","svce"); //here s3 pointing to the object.
        s3 = s2; //whenever s3 assigning s2 that time s3 pointing tothe s2 object then previous object of s3 will be removed automatically from the heap.
        s2=null;

        System.out.println(s3);
        System.out.println(s2);
        
    }
}

class Student  {

    String rollNO ;
    String collegeName;

    Student () {

    }
    Student(String rollNO,String collegeName) {

        this.rollNO = rollNO;
        this.collegeName = collegeName;
    }
    void hello () {
        System.out.println(this.rollNO);
        System.out.println(this.collegeName);
    }
    @Override
    public String toString() {
        return "Student [rollNO=" + rollNO + ", collegeName=" + collegeName + "]";
    }
}