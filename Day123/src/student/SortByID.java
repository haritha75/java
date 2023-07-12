package student;

import java.util.Comparator;

public class SortByID implements Comparator<Student> {
    public int compare(Student first, Student second){

        return first.getId() - second.getId();
    }
}
