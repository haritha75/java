// write a program on polynomial time complexity

public class Polynomial_Time_Com
{
public static void main(String args[])
{
int n=4;
int c=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
for(int k=1;k<=n;k++)
{
System.out.println(i+" "+j+" "+k);
c++;
}
}
}
System.out.print(c);
}
}

