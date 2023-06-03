//SOP means system.out.println .here system is a class and out means static object or variable and print means method.
public class SOP {

    public static void main(String[] args) {

        System1.out1.println1("out variable is static variable and calling println method with help of out variable that variable beongs to println1 class that means we are creating object to the println1 class and println method also static.");

    }
}
class System1 {

    static Println1 out1 = null;
}
class Println1{
    static void println1(String str) {
        System.out.println("haritha");
    }
}