public class SuperClassEmptyConstructor {

    public static void main(String[] args) {

        Nock n = new Nock();

    }
}
class Mock1 {

    Mock1() {
        System.out.println("rock");
        System.out.println("2nd line");
    }

    Mock1(int a) {
        System.out.println("a with one constructor");
    }

}
class Nock extends  Mock1 {

    Nock() { //whenever calling this constructor here we are not creating parent class constructor so defauly jvm create parent class empty constructor and go the that construcot and again check nick1 empty constructor then in nick1 empty constructor jvm create object class empty constructor defautly but in that constructor not containing anything.

        System.out.println("super class empty constructor and nock constructor");
    }
}