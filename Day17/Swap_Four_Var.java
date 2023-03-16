//write a program swaping four variables without using new varibles.
public class Swap_Four_Var
{
public static void main(String args[])
{
int a=13,b=5,c=4,d=7;
 a=a+b+c+d;
 b=a-(b+c+d);
 c=a-(b+c+d);
 d=a-(b+c+d);
 a=a-(b+c+d);
 System.out.println("a="+a);
 System.out.println("b="+b);
 System.out.println("c="+c);
 System.out.println("d="+d);
 }
 }
 
