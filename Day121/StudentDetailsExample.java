import java.util.ArrayList;
import java.util.Scanner;
public class StudentDetailsExample {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name;
        int ID;
        String Email;
        double GPA;
        addStudent();
      
        
    }
    static void addStudent() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Add a new student record:");
            System.out.print("Enter student name: ");
             String name = sc.next();
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            System.out.print("Enter student email: ");
            String email = sc.next();
            System.out.print("Enter student GPA: ");
            double GPA = sc.nextDouble();
        
        System.out.println("Student record added successfully.");
      
    } 
    
}