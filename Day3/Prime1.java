//write a program on prime number

public class Prime1
{
public static void main(String args[])
{
int n=5;
int count=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
count++;
}
if(count==2 || count==1)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}



