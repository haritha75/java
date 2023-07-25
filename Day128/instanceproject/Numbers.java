public class Numbers {

    public static void main(String[] args) {

        Example example = new Example();
        Example example1 = new Example();
        Example example2 = new Example();
        System.out.println(Example.getCount());

    }
}
class Example {

    private static int count;
    {
        count++;
    }

    public static int getCount() {
        return count;
    }
}