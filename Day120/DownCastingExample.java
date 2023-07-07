//downcasting is a typecasting of a parent object to a child object .
//it is not implicit.
public class DownCastingExample {

    public static void main(String[] args) {

        Parent  c = new  Child();
        Child c1 =(Child) c; //down casting explicitly.
        c1.nokia();
        c1.iphone();
    }

        
    }
    

class Parent {
    void nokia(){
        System.out.println("hello.....");
    }
}
class Child extends Parent {

    void iphone() {
        System.out.println("hi....");
    }
}