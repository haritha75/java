import java.net.Socket;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MainExample {

    static List<Student> list = new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        String choice;

        do {

            System.out.print("Enter a command (add, view, search, sort, exit): ");
            choice = sc.next();
            System.out.println();

            switch (choice.toLowerCase()) {
                case "add":                 
                    addStudent();
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
   private static void addStudent() {

         System.out.println("Add a new Student record:");
         System.out.println();
         String name = isValidName();
         int id = isUniqueID();
         String email = isValidEmail();
         double gpa = isValidGPA();

        Student s1 = new Student();
        s1.setName(name); 
        s1.setId(id);
        s1.setEmail(email);
        s1.setGpa(gpa);

        list.add(s1);
        System.out.println("Student record added successfully.");
        System.out.println();

    }
   private static String isValidName() {
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
                System.out.println("invalid name: ");
            }

        } while(!res);

        return name1;
    }
   private static int isUniqueID() {
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
                    if (data.getId() == id &&(id >=1 && id<=100)) {
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

   private static String  isValidEmail() {
        String email;
        boolean res;
        sc.nextLine();
        do {
            System.out.print("Enter student email: ");
           
            email = sc.nextLine();
            res = Pattern.matches("^\\D[0-9a-z.]{3,29}@[a-z]{2,10}[.][a-z]{2,3}", email);

            if(res);
            else {
                System.out.println("Please enter a valid email");
            }


        } while(!res);

        return email;
    }

    private static double isValidGPA() {
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

   private static void viewStudentRecords() {
        System.out.println("View all student records:");
        System.out.println();

        for(Student record : list) {
            System.out.println(record);
        }
        System.out.println();

    }
   private static void searchStudent(String name) {
       

        String reg = ".*" + Pattern.quote(name) + ".*";
        Pattern pattern = Pattern.compile(reg,Pattern.CASE_INSENSITIVE);

        List<Student> matchingNames = new ArrayList<>();
        for(Student names : list) {
            Matcher matcher = pattern.matcher(names.getName());

           
            if(matcher.find()) {
                matchingNames.add(names);
            }
            
        }

        if(matchingNames.isEmpty()) {
            System.out.println("No matching names found.");
        }

        else {

           for(Student nameMatch : matchingNames) {
            System.out.println(nameMatch);
        }
      }
      System.out.println();

    }
       
 
   private static  void sortStudent() {

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
    public int compare(Student first, Student second){
        return first.getId() - second.getId();
    }
}

class SortByGPA implements  Comparator<Student> {
    public int compare(Student first , Student second){
        return Double.compare(second.getGpa(),first.getGpa());
    }
}

class Student {

  private String name;
  private int id;
  private String email;
  private double gpa;

   

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
  
    @Override
    public String toString() {
        return "name=" + name + ", id=" + getId() + ", email=" + email + ", gpa=" + getGpa() ;
    }

}