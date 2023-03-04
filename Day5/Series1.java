//compute the natural logarithm of 2,by adding up to n terms in the series.
import java.util.Scanner;
public class Series1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double s=0;
for(int i=1;i<=n;i++)
{
if(i%2==0)
s-=1.0/i;
else
s+=1.0/i;
}
System.out.println(s);
}
}

