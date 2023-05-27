import java.util.*;

public class SumOfNumUsingWildCards {

    public static void main(String[] args) {

        List<Float> li = Arrays.asList(7.8f,44.5f,6.54f);
        print(li);
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(30);
        a1.add(90);
        print(a1);

        Queue<Double> li2 = new ArrayDeque<>();

        li2.add(33.4455);
        li2.add(89.5678);
        print(li2);



        }

    public static void print(Collection<? extends Number> a) { //here collection means it allows interface and its classes also.

        float sum = 0;

        for(Number x: a) {
            sum += x.floatValue(); //here if you give int value also converting floating value.
        }

        System.out.println(sum);
    }
}
