//Sealed class are used to specify which classes are permitted to extend it and prevent any other class.
//To sear a class,add the sealed modifier to its declaration.Then ,after any extends and implements clauses,add the permits clause.
//whenever we mention sealed class not  used permits keyword we must extends atleast one or more non-sealed class or final class only. not default classes.
//if you mention permits keyword in sealed class also extends only final and non-sealed classes.
//it available in java15.
public class SealedClass {

    public static void main(String[] args) {

        Fruit f = new Fruit();
        f.printName();

        Apple a = new Apple();
        a.printName();

        Orange o = new Orange();
        o.printName();

    }
}

sealed class Fruit permits Apple,Orange { //whenever sealed class permits the class only that classes can extends the sealed class not all extends the sealed class.
    void printName() {
        System.out.println("It is sealed class");
    }
}
non-sealed class Apple extends  Fruit {
    void printName() {
        System.out.println("It is apple class extends sealed class");
    }

}
final  class Orange extends  Fruit {

    void printName() {
        System.out.println("It is ornage class extends sealed class");
    }


}