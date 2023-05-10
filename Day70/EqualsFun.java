public class EqualsFun {

    public static void main(String[] args) {

        Duck d1 = new Duck();
        d1.age = 21;
        d1.weight = 245.67;

        Duck d2 = new Duck();
        d2.age = 21;
        d2.weight = 245.67;
        //d2=d1;

        Duck2 d3 = new Duck2();
        d3.age = 21;
        d3.weight =245.67;


        System.out.println(d1.equals(d2)); //here not checking content it check address of the both object
        System.out.println(d1==d2);

        System.out.println(d1.equals(d3));
        

    }
}
class Duck extends Object {

    public int age;
    double weight;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) //here this means d1 and obj means d2.it checks both object address
           return true;

        if(this.getClass()!=obj.getClass())
           return false;

        Duck duck = (Duck) obj;
           return this.age == duck.age && this.weight == duck.weight;
           
        

    }
}
class Duck2 {
    int age;
    double weight;
}