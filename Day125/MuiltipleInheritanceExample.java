public class MuiltipleInheritanceExample {

    public static void main(String[] args) {

        C c = new C();
        c.display();


        
    }
}
class A {
    void display() {
        System.out.println("hi.....");
    }
}
class B {

    void display() {
        System.out.println("hello..........");
    }
}
class C extends A,B { //here ,a and b have same method but c extends that classes whenever c calling that method that time compiler is in confusion state so that's why java does not support.

}