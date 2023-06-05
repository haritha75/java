import java.util.function.BiFunction;

class Arithmetic {
    public static int add(int a,int b) {
        return a+b;
    }

    public static float add(int a,float b) {
        return a+b;
    }

}

public class BiFunction1 {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> adder1 =  Arithmetic::add;
        BiFunction<Integer,Float,Float> add2 = Arithmetic::add;

        int res = adder1.apply(10,30);
        System.out.println(res);
        float res2 = add2.apply(4,7.9f);
        System.out.println(res2);
    }

}