import java.util.Objects;

//here if you want person details we have crete getters and setter and get the details.
public class PersonDetails {
    public static void main(String[] args) {

        Person p = new Person("haritha",22);
        System.out.println(p.hashCode());
        System.out.println(p);




    }
}
class Person {

    private  String name;
    private  int age;

    Person() {

    }
    Person(String name,int age) {

        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public java.lang.String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age);
    }
}

