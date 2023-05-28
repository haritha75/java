public class MultiplicationUsingGenerics {
    public static void main(String[] args) {
        
        Multiplication m = new Multiplication();

        System.out.println(m.mul(45.5f,78.8f));
        System.out.println(m.mul(9,5));
        System.out.println(m.mul(4L,8L));
    }
}
class Multiplication {

   
    public <T extends Number> float mul(T a, T b) { //it accept all type.if you not using generics then every type we have to creat new methods.here float menas return type whatever u=you it return float value.
        
        return a.floatValue() * b.floatValue();
    }
}
