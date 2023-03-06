// print the pattern

/*

10101
01010
10101
01010
10101

*/
public class NPattern5
{
public static void main(String args[])
{
int n=5;
for(int i=1;i<=n;i++)
{
int r=i%2;
for(int j=1;j<=n;j++)
{
System.out.print(r);
if(r==1)
r=0;
else
r=1;
}
System.out.println();
}
}
}
