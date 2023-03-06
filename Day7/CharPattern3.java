//print the pattern

/*

     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F

 

 */
 public class CharPattern3
 {
 public static void main(String args[])
 {
 int n=6;
 for(int i=1;i<=n;i++)
 {
 char s='A';
 for(int j=1;j<=n-i;j++)
 System.out.print(" ");
 for(int k=1;k<=i;k++)
 System.out.print(s++ +" ");
 System.out.println();
 }
 }
 }
