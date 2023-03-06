// print the pattern

/*

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5

*/

public class NPattern8
{
public static void main(String args[])
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<i;j++)
System.out.print(" ");
for(int k=i;k<=n;k++)
{
System.out.print(k+" ");
}
System.out.println();
}
for(int i=1;i<=n-1;i++)
{
for(int j=1;j<=n-i-1;j++)
System.out.print(" ");
int s=n-i;
for(int k=1;k<=i+1;k++)
{
System.out.print(s++ +" ");
}
System.out.println();
}
}
}
