public class Sample {

  public static void main(String[] args) {
    
   Object o = new Animal() ;
   System.out.println( o.toString());
   
  }
  
}

class Animal extends Object {

  String name;
  int age;

  void print() {
    System.out.println("hii");
  }
  
 
}

class Cat extends Animal {

    String color;
    void print() {
      System.out.println("hello...");
    }
 
}