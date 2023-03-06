//print the pattern

/*

             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1

 */
 public class NPattern
 {
 public static void main(String args[])
 {
 int n=5;
 for(int i=1;i<=n;i++)
 {
 System.out.print(" ");
 }
 System.out.print(1);
 for(int j=1;j<=n-1;j++)
 System.out.print(" ");
 int s=1;
 for(int k=0;k<=i;k++)
 {
 System.out.print(s+" ");
 s=s*(i-k)/(k+1);
 }
 }
 }
 }
