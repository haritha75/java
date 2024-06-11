import java.util.Scanner;

public class StudentManagementSystem {
    private static final int MAX_STUDENT_COUNT = 100;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    private Student[] students;
    private int studentCount;

    public StudentManagementSystem() {
        students = new Student[MAX_STUDENT_COUNT];
        studentCount = 0;
    }

    public void addStudent(String name, String ID, String email, double GPA) {
        if (studentCount < MAX_STUDENT_COUNT) {
            if (isValidEmail(email)) {
                Student student = new Student(name, ID, email, GPA);
                students[studentCount] = student;
                studentCount++;
                System.out.println("Student added successfully.");
            } else {
                System.out.println("Invalid email format. Please try again.");
            }
        } else {
            System.out.println("Maximum student limit reached.");
        }
    }

    public void viewStudents() {
        if (studentCount > 0) {
            for (int i = 0; i < studentCount; i++) {
                System.out.println(students[i]);
            }
        } else {
            System.out.println("No student records found.");
        }
    }

    public void searchStudents(String name) {
        if (studentCount > 0) {
            boolean found = false;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getName().equals(name)) {
                    System.out.println(students[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No student with the given name found.");
            }
        } else {
            System.out.println("No student records found.");
        }
    }

    private boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.next();
                System.out.print("Enter student ID: ");
                String ID = scanner.next();
                System.out.print("Enter student email: ");
                String email = scanner.next();
                System.out.print("Enter student GPA: ");
                double GPA = scanner.nextDouble();
                system.addStudent(name, ID, email, GPA);
            } else if (choice == 2) {
                system.viewStudents();
            } else if (choice == 3) {
                System.out.print("Enter student name to search: ");
                scanner.nextLine(); // Clear the new line character
                String name = scanner.nextLine();
                system.searchStudents(name);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
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

    public static void addStudent() {
    }
}