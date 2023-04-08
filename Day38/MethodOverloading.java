//write a program on method overloading
//more than two method have same name with different parameters called method overloading.
public class MethodOverloading
{
void mul(int a,int b)
{
System.out.println(a*b);
}
void mul(int a,int b,int c)
{
System.out.println(a+b+c);
}
void mul(String a,int b,int c)
{
System.out.println(a+b+c);
}

public static void main(String args[])
{
MethodOverloading mo=new MethodOverloading();
mo.mul(5,6);
mo.mul(4,7,9);
mo.mul("h",3,7);
}
}
