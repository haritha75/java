public class AssertionEx {

    public static void main(String[] args) {

        int age = 14;
        show(null);
        System.out.println("the voter's age is "+age);
    }

    static void show(String str) {
        assert str != null;
        System.out.println("hello....");
    }
}
