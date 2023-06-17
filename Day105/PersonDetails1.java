public class PersonDetails1 {


    public static void main(String[] args) {

        Person1 p = new Person1("reddy",21); //here, we cannot change the values once assigning because record is immutable.
        System.out.println(p);
        System.out.println(p.name());


       p = new Person1("haritha",21); //if you want the change the values then use like this.here, we are using same object passing the values.
        System.out.println(p);
        p.sayHi();
        Person1.sayHello(); //it is a static method  so directly calling the function.

        Person p2 = new Person("haritha",0);
        System.out.println(p2);

        Person3 p3 = new Person3();
        System.out.println(p3);



    }
}
class Person12 {
    String name;
}