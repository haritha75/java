//autoboxing nothing but converting primitive value into object of the corresponding wrapper class.that means primitive value will be covering with wrapper class like box.it automatically boxing in the process of coverting primitive to wrapper class.

public class Autoboxing {

    public static void main(String[] args) {

        char ch = 'a'; //primitive value
        Character g = ch; //wrapper class

        System.out.println(g);
        System.out.println(ch);
    }
}
