//Annotations are used to tell the compiler or jvm more information or data.
public class Annotation1 {

    public static void main(String[] args) {
       Cock c = new Cock();
       c.hi();

    }
}
class Hello {

    void hi() {
        System.out.println("hi man!");
    }
}
class Cock extends Hello { //here telling we are overriding the method we must mentioning same method name.

    @Override //override annotations are used to override the method from parent class method if you not mentioning correct method then it shows error. because we are overriding that method so same method name are used on that time.
    void hi() {
        System.out.println("rock mock!");
    }
}