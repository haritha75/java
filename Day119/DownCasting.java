import java.net.Socket;

//downcasting is a typecasting of a parent object to a child object .
//it is not implicit.
public class DownCasting {
    public static void main(String[] args) {

        Parent1 p = new Child1();
        p.name = "haritha";
        Child1 c =(Child1) p; //down casting explicitly.
        System.out.println(c.name);
    }



}


class Parent1 {
String name;
    void hello() {
        System.out.println("hello.......");
    }

}

class Child1 extends Parent1 {

    void hi() {
        System.out.println("say hi..........");
    }
}