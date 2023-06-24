//if  do not have atleast  one direct connection or pointing to the reference variable  from the main method to the objects  then it is called island of isolation.
public class IslandOfIsolation {

    public static void main(String[] args) {


        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = new Student(); //here again creating new objects.
        s1.name.name = new Student(); //again new object created.
        s1.name.name.id = 20;
        System.out.println(s1);
        s2 =s1; //whenever assining another reference variable s2 will be pointing  to the s1 objects.
        s1 = null; //whenever mentioning null it will removed.but objects are poining to the s2 reference variable alteast so it is not island of isolation.
        System.out.println(s1);
        System.out.println(s2);
        s2 = null; //whenever mentioning null it will removed. here , there is no direct connection or pointing  to the  objects to the reference variable because reference variable removed from heap so there is no reference variable it is called island of isolation.
        System.out.println(s2);


        
    }
    
}
class Student  {

    int id;

    Student name;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
    
}