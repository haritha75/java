@java.lang.FunctionalInterface
interface Nock3 {
    double main(double s);
}

public class MethodReference3 {


    public static void main(String[] args) {

        Nock3 n = Math::sqrt;
       double res = n.main(6.9);
        System.out.println(res);

    }
}
