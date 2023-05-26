//generic means parameterized types.It allows type Integer,String.....etc., and user defined types.
//using generics ,it is possible to create classes that work with different data types.
//if you donot know the type of the value that time use generics.for example ,weight,marks sometime integer and sometimes float that time ue generics.
//in generics you can use different types with same variables.
public class Generics1 {


    public static void main(String[] args) {

        Mock<Integer> virat = new Mock<>(79);
        Mock<Float> dhoni = new Mock<>(59.76f);

        System.out.println(virat.getMarks());
        System.out.println(dhoni.getMarks());




    }
}
class Mock<T> { //t is the generic it accept all types.see above we use one time integer and float .and here generic accept both types.

    T marks; //in this variable you can use different data types like Integer,Float.....etc.

    Mock(T t) {
        this.marks = t;
    }

    T getMarks() {
        return this.marks;
    }

}