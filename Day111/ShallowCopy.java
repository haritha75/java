//shallow copy  is used for copy the same object.
//diaadvantage of shallow copy is if you change one object then it effect to the other object also.
public class ShallowCopy {

    public static void main(String[] args) {
        

        SBI s = new SBI();

        s.a = 10;
        s.b = 15;

        System.out.println(s.a);
        System.out.println(s.b);

        SBI s1 = s; //here we are copy the s object to the s1.

          
          s1.a =22; //here we are changing the a value in s1 object.but it effect to the s objects also.

        System.out.println(s1.a);
        System.out.println(s.a);


    }
    
}
class SBI  {

    int a;
    int b;

    void print() {

        System.out.println("hello.......");
    }
}

interface RBI { //it is a custome marker interface.

}