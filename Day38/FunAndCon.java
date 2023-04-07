//write a program on functions and constrctors
public class FunAndCon
{
public static void main(String args[])
{
Hello h=new Hello();
h.setHello(20,22);//here int int calling function
}
}
class Hello
{
int x;//instace variable
Hello()
{
System.out.println("hello man!");
}
Hello(String person,int age)
{
System.out.println("two parameters");
}
void setHello()//function or method
{
System.out.println("rock the show");
}
void setHello(int y)//more than two method or function called method overloading.do not use same variable so confused.
{
this.x=y;
System.out.println("one parameter");
}
void setHello(int y,int s)//here set means we are set the value
{
System.out.println("two parameters");
}
}
