// print the pattern

/*

A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F

 */
 public class CharPattern2
 {
 public static void main(String args[])
 {
 int n=6;
 for(int i=1;i<=n;i++)
 {
 char s='A';
 for(int j=1;j<=n-i+1;j++)
 System.out.print(s++ +" ");
 System.out.println();
 }
 for(int i=1;i<=n;i++)
 {
 char s='A';
 for(int j=1;j<=i;j++)
 System.out.print(s++ +" ");
 System.out.println();
 }
 }
 }
