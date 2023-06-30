//covarient return type specifies that the return type may vary in the same direction as the subclass.
//before java5, it was not possible to override any method by changing the return type.but now,since java5 ,it is possible to override method by changing the return type if subclass overrides any method whose return  type is non-primitive but it change its return type to subclass type.
public class CovarientReturnType {

    public static void main(String[] args) {

        new Nick().mania().hello(); // like this call the method.
        

    }
    
}
class Rock {
    Rock mania() {
        return this;
    }
}
class Nick extends Rock {

    @Override

    Nick mania() { //see we are overriding the method here return type using subclass this is called covarient. also use parent class return type.overrdiing means same return type but here we are using  subclass return type because we areextends super class.
        return this;
    }
    void hello() {
        System.out.println("hello......");
    }
}