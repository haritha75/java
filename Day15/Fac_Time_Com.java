// write a program on factorial time complexity.

public class Fac_Time_Com
{
public static void main(String args[])
{
int c=0;
int n=9;
for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)
{
System.out.println(i+" "+j);
c++;
}
}
System.out.print(c);
}
}
//Here,first for loop runs n times and second for loop runs n times at first itereation and then decreases each iteration -1 times. this case used very rare condition only.it take soo much time.
