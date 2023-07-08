public class StudentDetails {
    

    String name;
    int age;
    int rollNo;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "StudentDetails [name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]";
    }
    
    
}
