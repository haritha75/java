public class polymorphism {

  String name;
  int age;
  void print() {
    System.out.println("poly");
  }

  public static void main(String[] args) {
    
    polymorphism p =new animal();
    p.age = 12;
    p.name = "haritha";
    p.print();
  }
  
}
class animal extends polymorphism {

  void print() { //runtime this decision is taken from runtime only which function will call first compile in confusion
    System.out.println("child");

  }
}
