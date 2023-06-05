//function interface nothing but it contains only one abstract method.
@java.lang.FunctionalInterface
interface Rock3 {
    void main(int x,int y);
}
public class LambdaExpression {

    public static void main(String[] args) {
        int a = 18;

        Rock3 r= (x,y) -> System.out.println("rock"+((x+y)+a)); //it is lambda expression like anynomous class type.
        r.main(3,7);


    }
}
