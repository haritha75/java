package student;

import java.util.Comparator;

public class SortByGPA implements Comparator<Student> {
    public int compare(Student first , Student second){

        return Double.compare(second.getGpa(),first.getGpa());
    }
}