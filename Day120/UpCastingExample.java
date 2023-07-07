//upcasting is the typecasting of a child object to a parent object  and it can be done implictly.

public class UpCastingExample {

    public static void main(String[] args) {

        Parent c = new Child();
        c.nokia();
        
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