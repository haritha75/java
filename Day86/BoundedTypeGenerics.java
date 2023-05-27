public class BoundedTypeGenerics {

    public static void main(String[] args) {



        printData(new Student1());
        printData(new Farmer1());
        printData(new Human1());
      //  printData(new Buffalo1());

    }

    //which class extends the human1 class that classes only allowing.
    public static <T extends Human1> void printData(T h1) { //see it accept all types.it is a generics methods.but without generics whatever we mention type that only will accept.
        System.out.println(h1); //bound type generics whatever we mention that type and that type subclasses only accept here human parent of student1 and farmer1 but not buffalo1 that why it shows error.
    }


}
class Human1 {
    int age;
    double weight;

    Human1() {

    }
    Human1(int age,double weight) {
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
class Student1 extends Human1 {
    int idNo;
    String college;

    public Student1() {

    }

    public Student1(int idNo, String college) {
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
class Farmer1 extends Human1 {

    int since;
    double landAcres;

    public Farmer1() {

    }

    public Farmer1(int since, double landAcres) {
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
class Buffalo1 {

    int liters;
    int children;
    public Buffalo1() {

    }

    public Buffalo1(int liters, int children) {
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


