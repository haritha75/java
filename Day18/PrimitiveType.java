//write a program on pass by value
public class PrimitiveType
{
public static void main(String args[])
{
int a=22;//Primitive type
System.out.println(a);
Fun(a);
System.out.println(a);
}
static void Fun(int a)
{
a++;
System.out.println(a);
}
}
