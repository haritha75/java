public class WrapperClass1 {

    public static void main(String[] args) {

        int age = 44; //primitive type
        System.out.println(age);

        Age a = new Age(36); //wrapper class object
        System.out.println(a);
    }
}
class Age {

    int value;
    Age(int value) {
        this.value = value;
    }
}
