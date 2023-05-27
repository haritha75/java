public class HumanDataUsingGenerics {

    public static void main(String[] args) {

        System.out.println(new Human(21, 43.2));
        System.out.println(new Human()); //here we are not mentioning anything.


        Human h = new Human(); //this is also same above like but in above we passing values directly here creating object and then pass the values
        h.setAge(22);
        h.setWeight(42.3);
        System.out.println(h);

        //using generics printing the data.
        printData(14.96f);
        printData("true");
        printData(2L);
        printData(new Student(77,"svu"));
        printData(new Farmer(2001,4));
        printData(new Human(19,50.9));
        printData(new Buffalo(6,3));

    }
        
        public static <T> void printData(T h1) { //see it accept all types.it is a generics methods.but without generics whatever we mention type that only will accept.
            System.out.println(h1);
        }


}
class Human {
    int age;
    double weight;

     Human() {

     }
     Human(int age,double weight) {
         this.age = age;
         this.weight = weight;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
class Student extends Human {
    int idNo;
    String college;

    public Student() {

    }

    public Student(int idNo, String college) {
        this.idNo = idNo;
        this.college = college;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNo=" + idNo +
                ", college='" + college + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
class Farmer extends Human {

    int since;
    double landAcres;

    public Farmer() {

    }

    public Farmer(int since, double landAcres) {
        this.since = since;
        this.landAcres = landAcres;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public double getLandAcres() {
        return landAcres;
    }

    public void setLandAcres(double landAcres) {
        this.landAcres = landAcres;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "since=" + since +
                ", landAcres=" + landAcres +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
class Buffalo {

    int liters;
    int children;
    public Buffalo() {

    }

    public Buffalo(int liters, int children) {
        this.liters = liters;
        this.children = children;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Buffalo{" +
                "liters=" + liters +
                ", children=" + children +
                '}';
    }
}