public class CallingSuperConstructorUsingChildClass {


    public static void main(String[] args) {

        Duck1 duck = new Duck1(1);
        Duck1 duc  = new Duck1();

    }
}
class Nick1 {

    Nick1() {
        System.out.println("default parent");
    }

    Nick1(int x) {
        System.out.println("one parent");
    }
    Nick1(int x,int y) {
        System.out.println("two parent");
    }
}
class Duck1 extends  Nick1 {

    Duck1() {
        super(7);
        System.out.println("default child");
    }
    Duck1(int x) {
        super(3,9); //here whenever calling one parement constructor then first calling super class two parameter constructor and next pritnted child class constructor.
        System.out.println("one child");
    }
    Duck1(int x,int y) {
        System.out.println("two child");
    }
}