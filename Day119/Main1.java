import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<Student>  list = Data.getStudentList();
        list.stream().limit(2).forEach(n -> System.out.println(n)); //here we give limit 2 so it print only two  objects data.
        list.stream().limit(2).map(Student::name).forEach(n -> System.out.println(n));
        list.stream().map(Student::branch).forEach(System.out::println);
        System.out.println(list.stream().map(Student::branch).distinct().toList());
        System.out.println(list.stream().filter(n -> n.branch().equals("Civil")).mapToInt(Student::roll).average().getAsDouble());
        list.stream().limit(2).sorted(Comparator.comparingDouble(Student::roll)).forEach(n -> System.out.println(n));
        list.stream().limit(2).sorted(Comparator.comparingDouble(Student::id)).forEach(n -> System.out.println(n));



    }
    
}

record Student(int roll,String name,String branch,int id) {
    
}
class Data {
    public static List<Student> getStudentList() {
        List<Student> li = new ArrayList<>();

        li.add(new Student(10,"haritha","CSE",23));
        li.add(new Student(27,"reddy","MEC",87));
        li.add(new Student(39,"ramya","Civil",45));
        li.add(new Student(59,"raj","Civil",32));


        return li;


    }
}