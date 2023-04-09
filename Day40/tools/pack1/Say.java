package pack1;
import pack2.*;

public class Say extends Fox {
    protected static int d;
    public static void main(String[] args) {
        Fox s1=new Fox();
        System.out.println(s1.e);//not woking because we are delcaring 'e' as a default modifier .so not working as a different package subclass and not working diferent package without subclass
    }
    
}
