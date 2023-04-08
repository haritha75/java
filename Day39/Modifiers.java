//write a program on modifiers.
//modifiers are four types and they are public ,private,default,protected.
//class always public or default not private.if you put class as private we not accessing anywere.

public class Modifiers//public modifer
{
public static void main(String args[])
{
Hello h=new Hello();//creating object with class name.Hello() means calling the function.
h.sayHello();//calling function with object.if you want without object 
Hello.sayHello(10);//without object calling function with class.

}
}
class Hello//default modifier if you use private class not accessing anywhere. here we are not create Hello constrctor but it automatically create empty constrctor. if you have parametized constrctor you have create empty constrctor.it not create empty one. you have create it.
{
void sayHello()
{
System.out.println("hello guys");
}
static void sayHello(int x)//here static means with main method reference.and without using object so declare with static.and same function with different parameter.
{
System.out.println("how are you");
}
}
