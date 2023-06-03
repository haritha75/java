//in singleton design pattern early instance is one type of pattern.
//early instance  means if you not calling  object then automatically created object to that class loader at load time.
public class EarlyInstantiation {

    public static void main(String[] args) {

//        A1.returnObj().doSomething();
//        System.out.println(A1.x);
//        A1.returnObj();




    }
}
class A1 { //but in main method you can create many object to that class if you want to only one object to that class use below like this.

    private static A1 obj = new A1(); //static object will created only once.if you call different methods then it point to the same object. here, creating one object with class but it is in private.so we are not creating muiltiple object to that class only object will be created.

     static int x =10*87;

    private A1() {

    }

    public static A1 returnObj() {
        return obj;
    }

    public void doSomething() {
        System.out.println("do something");
    }


}