public class DefaultAndStaticMethods  implements Que { //que interface contain all the features of nock11 and quiz interfaces properties.

    @Override
    public void duck() {
        System.out.println("say hello");
    }

    public static void main(String[] args) {

        DefaultAndStaticMethods d1 = new DefaultAndStaticMethods();
        d1.duck();
        d1.Print();
        Nock11.Forg();
        d1.s1();
        d1.s3();

    }

    @Override
    public void s1() {
        System.out.println("s1 methods in quiz interface");

    }

    @Override
    public void s3() {
        System.out.println("s3 method in que interface");

    }
}

@FunctionalInterface
interface Nock11 {

    void duck(); //it is abstract method we must implement and then call.
    static void Forg() { //static method we donot need variable call directly without creating variable.
        System.out.println("interface contians static methdos also");
    }
    default void Print() {
        System.out.println("hello");
    }
}
interface Quiz {
    void s1();
}

interface Que extends Nock11,Quiz{ //we are we are extending the two interfaces not implementing because que is also interface .an interface not implementing the values if you want that values we can use normal class and implement the method i that class and then call the methods.
    void s3();

}