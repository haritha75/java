// write a program on  loglinear time complexity

public class Log_Linear
{
public static void main(String args[])
{
int n=8;
int count=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<n;j*=2)
{
count++;
System.out.println(i+" "+j);
}
}
System.out.print(count);
}
}
//Here,it  is a combination  of n and logn and seonds loop occcurs n times for each iteration.
