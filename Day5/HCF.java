//write a program to calculate HCF of two given number.
public class HCF
{
public static void main(String args[])
{
int n1=10;
int n2=40;
int r=1;
for(int i=2;i<=n2;i++)
{
if((n1%i==0)&&(n2%i==0))
r=i;
}
System.out.println(r);
}
}
