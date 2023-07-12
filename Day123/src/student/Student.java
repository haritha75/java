package student;

public class Student {

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