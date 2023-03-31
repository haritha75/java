//Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigits
{
public static void main(String args[])
{
int n=126;
int res=sumDigits(n);
System.out.print(res);
}
static int sumDigits(int n)
{
if(n==0)
return 0;
int r=n%10;
return r+sumDigits(n/10);
}
}
