package pack1;
import pack2.*;
import pack2.subpack2.*;//it means we alreadu import pack2 but it only import pack2 files not folders that's why again import subpack2.
import pack2.subpack2max.*;
import java.lang.Math;//default package in java package

public class Hello {
    public static void main(String[] args) {
        Rock r=new Rock();
        System.out.println(r.getAdding());//insted of getA() using getAdding() function.
        //Mock m=new Mock();
        Mock.sayHi(5);// it means calling function wth  mock function .mock function we mention static method and public.
        System.out.println(Mock.Pi);//here we are declaring static variable with public.
        Fox f=new Fox();
        f.speed(10);
        Deer d=new Deer();
        d.years();
        d.setAge(9);
        System.out.println(d.getAge());
       int res=Max.max(10,20);//means math class with max function calling.
       System.out.println(res);
       int res1=Math.max(50,90);//here we not creating math class with max function  but already downloading java packages default.
       System.out.println(res1);
       Horse.Hey("everyone");

    }
}
