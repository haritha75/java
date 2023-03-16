//write a program swaping three variables without using new varibles.
public class Swap_Three_Var
{
public static void main(String args[])
{
int a=4,b=8,c=9;
 a=a+b+c;
 b=a-(b+c);
 c=a-(b+c);
 a=a-(b+c);
 System.out.println("a="+a);
 System.out.println("b="+b);
 System.out.println("c="+c);
 }
 }
