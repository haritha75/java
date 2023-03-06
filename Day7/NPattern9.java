//print the pattern
/*

   1
  212
 32123
4321234
 32123
  212
   1

 
 */
 public class NPattern9
 {
 public static void main(String args[])
 {
 int n=4;
 for(int i=1;i<=n;i++)
 {
 int u=i;
 for(int j=1;j<=n-i;j++)
 System.out.print(" ");
 for(int k=1;k<=i;k++)
 System.out.print(u--);
 for(int l=1,m=2;l<=i-1;l++)
 System.out.print(m++);
 System.out.println();
 }
 for(int i=2;i<=n;i++)
 {
 for(int j=1;j<=i-1;j++)
 System.out.print(" ");
 for(int k=n-i+1;k>=1;k--)
 System.out.print(k);
 for(int l=1,m=2;l<=n-i;l++)
 System.out.print(m++);
 System.out.println();
 }
 }
 }
 
