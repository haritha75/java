//print the pattern
/*

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
    
    */
 public class DiamondEmp
 {
 public static void main(String args[])
 {
 int n=5;
 for(int i=1;i<=n-1;i++)
 System.out.print(" ");
 System.out.print("*");
  System.out.println(); 
 for(int i=2,l=1;i<=n;i++,l+=2)
 {
 for(int j=1;j<=n-i;j++)
 System.out.print(" ");
 System.out.print("*");
 for(int k=1;k<=l;k++)
 System.out.print(" ");
 System.out.print("*");
 System.out.println(); 
 }
 for(int i=2,l=5;i<=n-1;i++,l-=2)
 {
 for(int j=1;j<=i-1;j++)
 System.out.print(" ");
 System.out.print("*");
 for(int j=1;j<=l;j++)
 System.out.print(" ");
 System.out.print("*");
 System.out.println(); 
 }
 for(int k=1;k<=n-1;k++)
 System.out.print(" ");
 System.out.print("*");
 }
 }

