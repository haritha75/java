//write a program on sum of natural numbers using recursion
public class NaturalNum
{
public static void main(String args[])
{
int sum=0;
int n=8;
int res=sum(n);
System.out.print(res);

}
static int sum(int n)
{
if(n==1)//base condition
return 1;
int a=n+sum(n-1);
return a;
}
}
