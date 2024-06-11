//write a program on factorial using recursion
public class Factorial
{
public static void main(String args[])
{
int n=5;
int res=Fact(n);
System.out.println(res);

}
static int Fact(int n)
{
if(n==0)//base condition.Here, 0 return 1 means 0! is 1 and 1! is 1.
return 1;
int a=n*Fact(n-1);
return a;
}
}
