public class Variable{
    public static void main(String[] args) {
        {
            int x=10;
            System.out.println(x);
        }
        int x=22;//its working because above x scope completed i means above variable work completed and then next x will be come to stack and then print.
        System.out.println(x);
    }
}
