//it is used for creations of an exact copy of an object.
public class CloneMethod {

    public static void main(String[] args) throws CloneNotSupportedException {
        

        SBI s1 = new SBI();

        s1.a =20;
        s1.b =12;

        System.out.println(s1.a);
        System.out.println(s1.b);


        SBI s2 = (SBI) s1.clone(); //here we are cloning all the values of s1 object  to the s2 object.whenever s1.clone() it will check either s1 object implementing or not the clonable interface if not then not copy the values.

        System.out.println(s2.a);
        System.out.println(s2.b);




    }


    
}
class SBI  implements Cloneable { //clonable is empty interface.it is used for permission purpose if sbi implement the this interface that only eligible for permission otherwise not.

    int a;
    int b;

   
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

