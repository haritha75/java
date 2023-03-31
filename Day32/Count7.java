//Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class Count7
{
public static void main(String args[])
{
int n=717377;
int res=count7(n);
System.out.print(res);
}
static int count7(int n)
{
if(n==0)
return 0;
int r=n%10;
if(r==7)
return 1+count7(n/10);//count increase by 1.
 return 0+count7(n/10);//count not increase if not equal to 7.
}
}
