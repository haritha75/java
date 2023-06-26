//sealed interface like sealed class time just here interfaces are used remaining same.
public class SealedInterface {

    public static void main(String[] args) {

        Shock s = new Shock();
        s.printName();
        joke j = new joke();
        j.prinName();
        Lock l = new Lock();
        l.printName();


        
    }
    
}
sealed interface Rock permits Mock { //here we are given permits only mock class so it only extends the rock class.
    void printName();
}
 abstract sealed class Mock  implements  Rock { //we are extends interface so use implements.but we cannot create to the abstract class.here we are not mentioning permits keyword that  means any class can extends (only non-sealed or final classes).

    @Override
    public void printName() {
        System.out.println("here we are using abstract sealed class so again extends the another class because it is sealed class");

    }
}
non-sealed class Shock extends Mock {
    public void printName() {
        System.out.println("again extends abstract sealed class because it is must be extends non-sealed class or final class");
    }
}
final class Lock extends Mock {
    public  void printName() {
        System.out.println("if you have sealed type classs then you must extends final or non-sealed class ");
    }
}
class joke extends Shock {
    void prinName() {
        System.out.println("you can extends non-sealed class with default classes");
    }
}
