public class Constructor {

    public static void main(String[] args) {

        Duck duck = new Duck(1,9);

    }
}
class Nick {

    Nick() {
        System.out.println("default parent");
    }

    Nick(int x) {
        System.out.println("one parent");
    }
    Nick(int x,int y) {
        System.out.println("two parent");
    }
}
class Duck extends  Nick {

    Duck() {
        System.out.println("default child");
    }
    Duck(int x) {
        System.out.println("one child");
    }
    Duck(int x,int y) {
        System.out.println("two child");
    }
}