//print the number of digits given number using recursion

public class LenNum
{
public static void main(String args[])
{
int n=27894641;
System.out.println(lenNum(n));
}
static int lenNum(int n)
{
if(n==0)
return 0;
return 1+lenNum(n/10);
}
}


