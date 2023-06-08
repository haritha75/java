//if different interfaces have same method  default name then must and should override that method.
public class InterfacesMethods implements Cow,Buffalo { //a class implements multiple interfaces but only one class implements not more classes.

    public static void main(String[] args) {

        InterfacesMethods n = new InterfacesMethods();
        n.milk();

    }

    @Override
    public void milk() {
        Buffalo.super.milk();
    }

}
interface Cow {
    default void milk() {
        System.out.println("cow milk");
    }
}
interface Buffalo {

    default void milk() {
        System.out.println("buffalo milk");
    }
}