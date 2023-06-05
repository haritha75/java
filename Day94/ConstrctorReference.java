@java.lang.FunctionalInterface

interface Cock {
    void duck1(int x,int b);
}
public class ConstrctorReference {

    ConstrctorReference() {
        System.out.println("main 1");
    }
    ConstrctorReference(int a ,int b) {
        System.out.println("main 2");
    }

    public static void main(String[] args) {

        Cock c = ConstrctorReference::new; //this is constructor reference syntax.
        Cock c1 =  Cock2::new;

        c.duck1(3,8);
        c1.duck1(6,3);

    }
}
class Cock2 {

    Cock2(int x,int y) {
        System.out.println(x+y);

    }

}
