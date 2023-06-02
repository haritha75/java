public class Singleton_design_Pattern {

    public static void main(String[] args) {

        A.getA().doSomething();
        A.getA();
        System.out.println(A.getA().x);

    }
}
class A {

    private static A obj = new A(); //here we are creating new object with class.and also mentioning private so it cannot access another class.it sis a static object it will stored only one time in class loader.

    int x = 15;

    private A() { //here ,we ccannot access constructor because it is in private.

    }

    public static A getA() { //her we are using type is class type reference.like this method we are access private object into other class.
        return obj;

    }

    public void doSomething() {
        System.out.println("do something");
    }
}
