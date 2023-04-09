package pack1;
import pack2.*;

public class Rock extends Fox {
    protected int a;
    public static void main(String[] args) {
        Fox f1=new Fox();
        System.out.println(f1.f);//its working because  f will be public and also using as a subclass .so public modifier we are using different package subclass.if ypu not using subclass also working because we are declaring vairavle as public.
        
    }
}
