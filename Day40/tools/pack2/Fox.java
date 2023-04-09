package pack2;
import pack1.*;

public class Fox {//not using subclass only using main class
    public int f;
    int e;//it is a default modifier. not using other package.only same package and same file also.
    public static void main(String[] args) {
        Mock m1=new Mock();
        System.out.println(m1.c);//here not working because mock delcaring as a protected and it working with different packages with subclass only not non subclass means without subclass not working.
        Fox f1=new Fox();
        System.out.println(f1.e);
        System.out.println(f1.f);
    }
}
