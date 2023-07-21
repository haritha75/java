import student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        student.show();
        System.out.println("Number of objects : "+Student.totalStudent());
        student.studentDetails();


        Student student1 = new Student();
        student1.input();
        student1.show();    
        System.out.println("Number of objects : "+Student.totalStudent());
        student1.studentDetails();


        Student student2 = new Student();
        student2.input();
        student2.show();    
        System.out.println("Number of objects : "+Student.totalStudent());
        student2.studentDetails();



    }
}