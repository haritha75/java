public class GetterAndSetter {
    public static void main(String[] args) {

        Student s1 =new Student();
        s1.setName("haritha");
        System.out.println(s1.getName());
        
    }
    
}
class Student {
    private String name ;

    public void setName(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Student [name=" + getName() + "]";
    }
    
}