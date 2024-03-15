import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MainExample {

    static List<Student> list = new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in); 
    static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";


    public static void main(String[] args) {

        String choice;
        do {
           
            System.out.print("Enter a command (add, view, search, sort, exit): ");
            choice = sc.next();
            sc.nextLine(); 

            switch (choice.toLowerCase()) {
                case "add":System.out.println("Add a new Student record:");
                           String name = isValidName();
                           //System.out.print("ID: ");
                           int id = isUniqueID();
                           String email = isValidEmail();
                           double gpa = isValidGPA();

                    addStudent(name,id,email,gpa);
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
    static void addStudent(String name,int id,String email,double gpa) {

        Student s1 = new Student();
        
       
        System.out.println("Student record added successfully.");
        System.out.println();
        list.add(s1);
                
    }
    static String isValidName() {
        String name;
        boolean res;
        do {
            System.out.print("Enter student name: ");
            name = sc.next();

            res = Pattern.matches("^[A-Za-z\\s]+$", name);
            if(res);

            else {
                System.out.println("Enter valid name First character should be UpperCase: ");
            }

        } while(!res);

        return name;
    }
    static int isUniqueID() {
        boolean flag = false;
        int id;
        if(list.size()==0) {
            System.out.print("Enter Student ID: ");
            id = sc.nextInt();
        }
        else {
            do {
                System.out.print("Enter Student ID: ");
                id = sc.nextInt();
                int count = 0;
                for (var data : list) {
                    if (data.id == id) {
                        System.out.println("ID already exist, please enter valid ID");
                        count++;
                    }
                }
                if(count==0) {
                    flag = true;
                }

            } while (!flag);
        }
        return id;
    }

    static String  isValidEmail() {
       String email;
       boolean res;

       do {
        System.out.println("Enter student email: ");
        sc.nextLine();
        email = sc.nextLine();
        res = Pattern.matches(EMAIL_REGEX, email);

        if(res);
        else {
            System.out.println("Please enter a valid email");
        }

        
       } while(!res);

       return email;
    }

    static double isValidGPA() {
        boolean flag = false;
         double gpa;
         do {
            System.out.println("Enter student GPA: ");
            gpa = sc.nextDouble();
            if(gpa>0 && gpa<=10) {
                flag = true;
            }
            if(flag);
            else 
               System.out.println("Please enter a valid GPA between 0 to 10");
         } while(!flag);

         return gpa;

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