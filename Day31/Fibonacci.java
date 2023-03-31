//write a program on fibanacci using recursion
public class Fibonacci
{
public static void main(String args[])
{
int n=7;
int res=Fib(n);
System.out.print(res);

}
static int Fib(int n)
{
if(n==0||n==1)//base condition.Here, 0 return 1 means 0 return 0 and one return 1 value 0+1 return 1 value means 0+1=1.
return n;
int a=Fib(n-1)+Fib(n-2);
return a;
}
}
