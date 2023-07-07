public class FunctionalInterface {

    public static void main(String[] args) {
        
    }
    
}
@FunctionalInterface
interface Rock {
    void mock();

}
 interface Nock implements Rock { //one interface cannot implement another interface

 }
 
 interface Fork extends Rock{ //one interface extends another interface but not implementing.

 }
 @FunctionalInterface
 interface Duck  extends Rock{ // one functional interface cannot extends another functional interface because functional interface contains only one abstract method if you extends another functional interface then it contains two abstract methods but functional interface means only one abstract method that's why it shows errors.

    void shock();
 }