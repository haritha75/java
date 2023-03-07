//print the pattern
 /*
 1 2 3 4 5
 1 2 3 4 *
 1 2 3 * * *
 1 2 * * * * *
 1 * * * * * * *
 
 */
 
 public class NAndS
 {
 public static void main(String args[])
 {
 int n=5;
 for(int i=1;i<=n;i++)
 System.out.print(i+" ");
 System.out.println();
 for(int i=2,l=1;i<=n;i++,l+=2)
 {
 for(int j=1;j<=n-i+1;j++)
 System.out.print(j+" ");
 for(int k=1;k<=l;k++)
 System.out.print("* ");
 System.out.println();
 
 }
 }
 }
