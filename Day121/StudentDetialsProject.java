import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentDetialsProject {

    static List<Student> list = new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in); 
    static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";


    public static void main(String[] args) {

        String choice;
        do {
           
            System.out.print("Enter a command (add, view, search, sort, exit): ");
            choice = sc.next();
            sc.nextLine(); 

            switch (choice) {
                case "add":
                    addStudent();
                    break;
                case "view":
                    viewStudentRecords();
                    break;
                case "search":
                    searchStudent();
                    break;
                case "sort":
                    sortStudent();
                    break;
                case "exit":
                    System.out.println("Exiting the program...");
                    break;    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!(choice.equals("exit")));
           
        
    }
    static void addStudent() {

        Student s1 = new Student();
        System.out.println("Add a new Student record:");
        System.out.print("Name: ");
        s1.name = sc.nextLine();
        System.out.print("ID: ");
        s1.id = sc.nextInt();
        System.out.print("Email: ");
        s1.email = sc.nextLine();
        s1.email = sc.nextLine();

        if(isValidEmail(s1.email)) {
        }
        else {
            System.out.println("Invalid email format.");
        }

        System.out.print("GPA: ");
        s1.gpa = sc.nextDouble();
        if(isValidGPA(s1.gpa)){

        }
        else {
            System.out.println("Enter GPA between 0 to 10");
        }
        System.out.println("Student record added successfully.");
        System.out.println();
        list.add(s1);
                
    }

    static boolean isValidEmail(String email) {
       return email.matches(EMAIL_REGEX);
    }
    static boolean isValidGPA(double gpa) {
        if(gpa>0 && gpa<=10){
            return true;
        }
        return false;

    }

    static void viewStudentRecords() {
        System.out.println("View all student records:");
        for(Student record : list) {
            System.out.println(record);
        }
        System.out.println();

    }
    static void searchStudent() {
        System.out.print("Enter student name: ");
        String name1 = sc.next();

        for(Student record : list) {
            if(record.name.equals(name1)) 
                System.out.println(record);
            
            else {
                System.out.println("Name is not in the record.");
            }
        }

    }

    static  void sortStudent() {

        System.out.println("Sort student record:");
        //System.out.println("Enter a regular expression to sort by (name, ID, email, or GPA: )");
        List<Student>  list1 =  list.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);
        
        
    

    }

    
}
class Student {

    String name;
    int id;
    String email;
    double gpa;

    @Override
    public String toString() {
        return "name=" + name + ", id=" + id + ", email=" + email + ", gpa=" + gpa ;
    }


}