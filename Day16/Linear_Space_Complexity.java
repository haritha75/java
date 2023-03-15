// write a program on linear space complexity
public class Linear_Space_Complexity
{
public static void main(String args[])
{
int n=10;
int sum=0,c=0;
for(int i=1;i<=n;i++)
{
sum+=i;
c++;
System.out.println(sum);
}
System.out.print(c);
}
}
