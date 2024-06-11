import java.net.Socket;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MainExample {

    static List<Student> list = new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in);
    static final String EMAIL_REGEX = "^\\D[0-9a-z.]{3,29}@[a-z]{3,10}[.][a-z]{2,3}"; // "^\\D[0-9$#&@a-z]{7,33}@gmail.com$";


    public static void main(String[] args) {

        String choice;
        do {

            System.out.print("Enter a command (add, view, search, sort, exit): ");
            choice = sc.next();
            System.out.println();

            switch (choice.toLowerCase()) {
                case "add":
                    System.out.println("Add a new Student record:");
                    System.out.println();
                    String name = isValidName();
                    int id = isUniqueID();
                    String email = isValidEmail();
                    double gpa = isValidGPA();

                    addStudent(name,id,email,gpa);
                    break;
                case "view":
                    viewStudentRecords();
                    break;
                case "search": 
                    System.out.print("Enter a regular expression to search for: ");
                    String name4 = sc.next();

                    searchStudent(name4);
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
        s1.name = name;
        s1.id = id;
        s1.email = email;
        s1.gpa = gpa;

        list.add(s1);
        System.out.println("Student record added successfully.");
        System.out.println();

    }
    static String isValidName() {
        String name;
        boolean res;
        String name1 ="";
        sc.nextLine();
        do {
            System.out.print("Enter student name: ");
            name = sc.nextLine();

            res = Pattern.matches("[a-zA-z][A-Za-z/s]{2,20}", name);
            if(res) {
                String str = name.toLowerCase();
                boolean flag=true;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>64&&str.charAt(i)<91)  
                             name1 += str.charAt(i);  
                    else if(flag==true){
                        name1 += (char)(str.charAt(i)-32);
                        flag=false;
                    }
                    else if(str.charAt(i)==' '){
                        name1 +=(" ");
                        flag=true;
                    }
                    else{
                              name1 += str.charAt(i);
                    }
                        }
            }

            else {
                System.out.println("invalid name: ");//name min 3 max 20 chars
            }

        } while(!res);

        return name1;
    }
    static int isUniqueID() {
        boolean flag = false;
        int id;
        if(list.size()==0) {
            do{
                System.out.print("Enter Student ID: ");
                id = sc.nextInt();
                if(id>=1 && id<=100){
                    flag = true;
                }
                else{
                    System.out.println("Enter ID between 1 to 100");
                }
            } while(!flag);
           
        }
        else {
            do {
                System.out.print("Enter Student ID: ");
                id = sc.nextInt();
                int count = 0;
                boolean flag1 = false;
                for (var data : list) {
                    if (data.id == id &&(id >=1 && id<=100)) {
                        System.out.println("ID already exist, please enter valid ID");
                        count++;
                        flag1 = true;
                       
                    }
                    
                }
                if(count==0 && (id >=1 && id<=100)) {
                    flag = true;
                }
                else if(!flag1) {
                    System.out.println("Enter ID between 1 to 100");
                }

            } while (!flag);
        }
        return id;
    }

    static String  isValidEmail() {
        String email;
        boolean res;
        sc.nextLine();
        do {
            System.out.print("Enter student email: ");
           
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
            System.out.print("Enter student GPA: ");
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
        System.out.println();

        for(Student record : list) {
            System.out.println(record);
        }
        System.out.println();

    }
    static void searchStudent(String name) {
        int count =0;
        for(Student data : list) {
            if(data.name.contains(name) || data.name.equalsIgnoreCase(name) || data.name.toLowerCase().contains(name)) {
                System.out.println(data);
                count++;

            }
        }
        if(count == 0)
            System.out.println("Their is no record");

        System.out.println();


    }

    static  void sortStudent() {

        System.out.println("Sort student record:");
        String choice;
        sc.nextLine();

        System.out.println("Enter sort by id or gpa: ");
        choice = sc.nextLine();
        switch(choice.toLowerCase()) {

            case "id": list.sort(new SortByID());
                       System.out.println("sorted by Id:");
                        for(Student id : list)
                              System.out.println(id);
                        break;
            case "gpa": list.sort(new SortByGPA());
                        System.out.println("sorted by GPA: ");
                        for(Student gpa : list)
                           System.out.println(gpa);
                        break;
            default :
                System.out.println("invalid data");
        }
        System.out.println();


    }
    

}
class SortByID implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.id - b.id;
    }
}
class SortByGPA implements  Comparator<Student> {
    public int compare(Student a , Student b){
        return Double.compare(b.gpa,a.gpa);
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