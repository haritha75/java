
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentDetailsEx {
    private static final int MAX_STUDENTS = 100;
    private static final String STUDENT_ID_PATTERN = "^[A-Za-z]{2}\\d{3}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";


    private static String[] studentIds = new String[MAX_STUDENTS];
    private static String[] studentNames = new String[MAX_STUDENTS];
    private static String[] studentEmails = new String[MAX_STUDENTS];
    private static double[] studentGPA = new double[MAX_STUDENTS];
    private static int numOfStudents = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Records");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addStudent(input);
                    break;
                case 2:
                    viewStudentRecords();
                    break;
                case 3:
                    searchStudent(input);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        input.close();
    }

    private static void addStudent(Scanner input) {
        if (numOfStudents == MAX_STUDENTS) {
            System.out.println("Maximum number of students reached.");
            return;
        }

        System.out.print("Enter the student ID: ");
        String studentId = input.nextLine();
        if (!isValidStudentId(studentId) && !(isValidStudentEmail(studentId))) {
            System.out.println("Invalid student ID & Email format. Student ID must consist of 2 letters followed by 3 digits.");
            return;
        }

        System.out.print("Enter the student name: ");
        String studentName = input.nextLine();
        System.out.print("Enter the student email: ");

        String studentEmail = input.nextLine();
        System.out.print("Enter the student GPA: ");

        double studentGPA1 = input.nextDouble();
        
        studentIds[numOfStudents] = studentId;
        studentNames[numOfStudents] = studentName;
        studentEmails[numOfStudents] = studentEmail;
        studentGPA[numOfStudents] = studentGPA1;
        numOfStudents++;

        System.out.println("Student added successfully.");
    }

    private static boolean isValidStudentId(String studentId) {
        Pattern pattern = Pattern.compile(STUDENT_ID_PATTERN);
        Matcher matcher = pattern.matcher(studentId);
        return matcher.matches();
    }
    private static boolean isValidStudentEmail(String studentEmail) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(studentEmail);
        return matcher.matches();
    }

    private static void viewStudentRecords() {
        if (numOfStudents == 0) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("Student Records:");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student ID: " + studentIds[i]);
            System.out.println("Student Name: " + studentNames[i]);
            System.out.println("Student Email: "+ studentEmails[i]);
            System.out.println("Student GPS: "+studentGPA[i]);
            System.out.println();
        }
    }

    private static void searchStudent(Scanner input) {
        if (numOfStudents == 0) {
            System.out.println("No student records found.");
            return;
        }

        System.out.print("Enter the student ID to search: ");
        String searchId = input.nextLine();

        for (int i = 0; i < numOfStudents; i++) {
            if (studentIds[i].equals(searchId)) {
                System.out.println("Student found:");
                System.out.println("Student ID: " + studentIds[i]);
                System.out.println("Student Name: " + studentNames[i]);
                System.out.println("Student Email: "+ studentEmails[i]);
                System.out.println("Student GPS: "+studentGPA[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }
}



class Student {


    
    private String name;
    private String ID;
    private String email;
    private double GPA;

    public Student(String name, String ID, String email, double GPA) {
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + ID + ", Email: " + email + ", GPA: " + GPA;
    }
}