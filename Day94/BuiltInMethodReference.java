@java.lang.FunctionalInterface
interface hock {
    int max(int a,int b);
}

public class BuiltInMethodReference {
    public static void main(String[] args) {

        hock h = Math::max;
      int res=  h.max(5,9);
        System.out.println(res);

    }
}
