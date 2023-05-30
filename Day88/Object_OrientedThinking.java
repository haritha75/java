import java.util.Arrays;

public class Object_OrientedThinking {

    public static void main(String[] args) {

        Human h1 = new Human();
        h1.setName("haritha");
        h1.setAge(21);
        h1.setGender(Gender.FEMALE);
        h1.eating();
        h1.sleeping();


        Cars c1 = new Cars();
        c1.setBrand("BMW");
        c1.setMileage(20);
        c1.setSeatingCapacity(4);
        c1.setHavingAC(false);
        c1.setPrice(40_00_000);

        Cars c2 = new Cars();
        c2.setBrand("TATA");
        c2.setMileage(10);
        c2.setSeatingCapacity(5);
        c2.setHavingAC(true);
        c2.setPrice(10_00_000);

        Cars cars[] = {c1,c2};
        h1.setCars(cars);
        System.out.println(h1);

        Dog d1 = new Dog();
        d1.setName("teddy");
        d1.setSpeed(21.7);

        Cats c = new Cats();
        c.setName("kiddy");
        c.setSpeed(2.6);

        Object pets[] = {d1,c};
        h1.setPets(pets);



        House h = new House();
        h.setLength(3);
        h.setHeight(5);


        House h3 = new House();
        h3.setWidth(4);
        h3.setHeight(2);

        House house[] = {h,h3};
        c.setHouse(house);


        Servents s = new Servents();
        s.setName("ravi");
        s.setAge(29);
        s.setEducations("10th");
        s.setSalary(15000);

        Servents s1 = new Servents();
        s1.setName("revi");
        s1.setAge(35);
        s1.setEducations("10th");
        s1.setSalary(12000);

        Servents servents[] = {s,s1};
        h1.setServents(servents);

        System.out.println(h1);



    }
} class Human {

    private String name;
    private int age;
    Gender gender;

    Cars[] cars;
    Object[] pets;
    Servents[] servents;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cars[] getCars() {
        return cars;
    }

    public void setCars(Cars[] cars) {
        this.cars = cars;
    }

    public Object[] getPets() {
        return pets;
    }

    public void setPets(Object[] pets) {
        this.pets = pets;
    }

    public Servents[] getServents() {
        return servents;
    }

    public void setServents(Servents[] servents) {
        this.servents = servents;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", cars=" + Arrays.toString(cars) +
                ", pets=" + Arrays.toString(pets) +
                ", servents=" + Arrays.toString(servents) +
                '}';
    }
    void eating() {
        System.out.println("your eating or not?");
    }
    void sleeping() {
        System.out.println("she is sleeping atleast 8hrs");
    }
}
enum Gender {
    MALE,FEMALE;
}