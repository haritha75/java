//function interface nothing but it contains only one abstract method.
@java.lang.FunctionalInterface
interface Rock4 {
    int main(int x,int y);
}
public class LambdaExpression2 {

    public static void main(String[] args) {
        int a = 18;

        Rock4 r= (x,y) -> {
            int sum = x+y+a;
            return  sum;

        } ;//it is lambda expression like anynomous class type.

        System.out.println(r.main(3,7));

    }
}
