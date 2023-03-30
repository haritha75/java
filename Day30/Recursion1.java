//write a program on reccursion
public class Recursion1
{
public static void main(String args[])
{
int n=6;
int mycharges=charges(n);
System.out.println(mycharges);
return;
}
static int charges(int n)
{
System.out.println(n);
if(n==1)
return 1;
int mycharges=n+charges(n-1);
return mycharges;
}
}

