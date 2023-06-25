import java.io.Serializable;

public class SerializableInterfaceWorks {

    public static void main(String[] args) {
    

        Animal a = new Animal();

        if(a instanceof Serializable) {
            System.out.println("it allows permission if animal class implements the serilizable interface");
        }
        else {
            System.out.println("not allowing permission because animal class not implementing the interface.");
        }
    }
    
}
class Animal implements Serializable {

    void add( ) {
        System.out.println("adding two values.");
    } 
}