public class ClassCast {

  public static void main(String[] args) {
    
    Vehicle v = new Car();

    //Car c = v; // we cannot assign to the this object because type is parent right so not if you want we can cast the class like this

  // v = new Bycle() ; // it gives exception because here we are creating object to the bycle class and converting into the car right it will not working

    Car c1 = (Car) v; //here we are typing casting the class into child calss type to access the child class properties
    c1.age = 20;
    System.out.println(c1.age);

    Object o = new Vehicle(); //super of every class in java

    System.out.println(o.toString());


  }
  
}
class Vehicle {
  String name;
  void print() {
    System.out.println("hi.........");
  }
}
class Car extends Vehicle {

  int age;
  void print() {
    System.out.println("child");
  }
}

class Bycle extends Vehicle {

}