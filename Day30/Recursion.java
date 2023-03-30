//write a program on reccursion
public class Recursion
{
public static void main(String args[])
{
int n=6;
fun(n);
System.out.println("Done");
return;
}
static void fun(int n)
{
System.out.println(n);
if(n==0)
return;
fun(n-1);
return;
}
}

