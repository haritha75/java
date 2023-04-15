public class StaticClass1 {
    public static void main(String[] args) {
        A aa=new A();//A class without static functions and variables coped into this object.or stack.
        B bb=new B();//B class without static fun and var coped into object.
        B b1=new B();//it also all non static fun and var coped.
        System.out.println(aa.a);//here a is not static so printing with object reference.
        System.out.println(A.b);//here b is a static variable so printing with class.
        System.out.println(b1.d);//here d is static variable but printing wth object reference then it coped in object or stack.

    }

    
}
class A{
    int a=10;
    static int b=22;//belong class.its coped into class loaders only.

}
class B{
    int c=8;
    int s=7;
    static int d=33;//its belongs class.it also same.
}
