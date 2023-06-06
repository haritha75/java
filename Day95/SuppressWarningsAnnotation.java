//it annotation happens if you are declaring the something like variables,class,methods etc but not used that time it shows warning we mention suppresswarning annotation
public class SuppressWarningsAnnotation {

    public static void main(String[] args) {
       @SuppressWarnings("unused")
        A a = new A(); //here we are creating variable but not using it shows warning that time mention annotations.

    }
}
class A {
    @SuppressWarnings("unused") //this is value passed annotation.
    void run() { //it also shows warning because we are creating method but not used
        System.out.println("hello");
    }
}