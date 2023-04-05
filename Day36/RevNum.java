//reverse the given number using recursion
public class RevNum
{
public static void main(String args[])
{
int n=1234567;
revNum(n);
}
static void revNum(int n)
{
if(n==0)
return;
System.out.print(n%10);
revNum(n/10);
return;
}
}
