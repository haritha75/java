package pack2;
import pack1.*;

 public class Cock extends Say {
    public static void main(String[] args) {
        //Say s=new Say();
        System.out.println(Say.d);//it's working because here we are using protected modifiers but it works different packages with subclass.here,subsclass is a say not superclass if say is not subclass its not working.
        Fox c=new Fox();
        System.out.println(c.e);//it woriking because declaring varable as a default so fox and cock both are in same package also use fox as a subpackage its working.without subclass also working.
    }
    
}
