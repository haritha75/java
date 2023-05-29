//constructor chaining means calling multiple constructors at a time called constructor chaining.
public class ConstructorChaining {

    public static void main(String[] args) {

        Mock m = new Mock();
        System.out.println();
        Mock m1 = new Mock(3);

    }
}

class Mock {

    Mock() {

        this(44);

        System.out.println("1st constructor");
    }

    Mock(int a) {
        this(44.5555,"haritha");

        System.out.println("2nd constrctor");
    }

    Mock(double b,String s) {

        System.out.println("3rd constructor");
    }
}