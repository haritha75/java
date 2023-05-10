public class EqualsFun1 {
    


    public static void main(String[] args) {

        Duck d1 = new Duck();
        d1.age = 21;
        d1.weight = 245.67;

        Duck d2 = new Duck();
        d2.age = 21;
        d2.weight = 245.67;
        //d2=d1;

        System.out.println(d1.equals(d2));
        System.out.println(d1==d2); //here not checking content it check address of the both object.if you have same content also but both object have different address.
        

    }
}
class Duck extends Object {

    public int age;
    double weight;

   

    }

