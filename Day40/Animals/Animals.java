import  nonwild.*;
import wild.*;


public class Animals extends Sheep {
 public static void main(String[] args) {
    Cow.eat("gross");
    //Goat.(drink());//not working because we decalring as default modifier so it only access same package or same file or same package subclass
    Sheep.noice();//it working because here we are using protected modifier with different package subclass.
    //Lion.eat();//not working because declaring protected modifiers without subcalss in different class.
    Tiger.speed();//it working because declaring public modifiers without subclass and different package.
 }
}
