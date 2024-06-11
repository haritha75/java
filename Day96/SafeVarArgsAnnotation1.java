//it can be used whenever in our code we invoked means calling the method which having variable number of arguments.
//it is used in method/constructor and method should be final or static.
public class SafeVarArgsAnnotation1 {

    public static void main(String[] args) {

        Maths<Integer> my = new Maths<>();
        Integer[] a = {6,9,4,6};
        my.show(a);

    }
}
class Maths<T> { //generic t.
    @SafeVarargs
    final void show(T... arg) { //passing array
        for(T x: arg)
            System.out.println(x);
    }
}