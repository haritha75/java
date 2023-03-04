//write a program that read a set of integers, and then prints the sum of the even and odd integer.
public class EvenAndOdd
{
public static void main(String args[])
{
int ar[]={2,5,8,3,5,6,10};
int Even=0;
int Odd=0;
for (int a:ar)
{
if(a%2==0)
Even+=a;
else
Odd+=a;
}
System.out.println(Even);
System.out.println(Odd);
}
}

