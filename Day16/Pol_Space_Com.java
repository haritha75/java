//write aprogram on polynomial space complexity
public class Pol_Space_Com
{
public static void main(String args[])
{
int n=6,c=0;
for(int i=0;i<=n;i++)
{
for(int j=0;j<n-i-1;j++)
{
System.out.println(i+" "+j);
c++;
}
}
System.out.print(c);
}
}
