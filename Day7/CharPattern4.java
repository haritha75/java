//print the pattern

/*

     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A

 */
 
 public class CharPattern4
 {
 public static void main(String args[])
 {
 int n=6;
 char s='A';
 for(int i=1;i<=n-1;i++)
 System.out.print(" ");
 System.out.print(s);
  System.out.println(); 
  char s1='B';
 for(int i=2,l=1;i<=n;i++,l+=2)
 {
 for(int j=1;j<=n-i;j++)
 System.out.print(" ");
 System.out.print(s1);
 for(int k=1;k<=l;k++)
 System.out.print(" ");
 System.out.print(s1);
 System.out.println(); 
 s1++;
 }
 char s2='E';
 for(int i=2,l=7;i<=n-1;i++,l-=2)
 {
 for(int j=1;j<=i-1;j++)
 System.out.print(" ");
 System.out.print(s2);
 for(int j=1;j<=l;j++)
 System.out.print(" ");
 System.out.print(s2);
 System.out.println(); 
 s2--;
 }
 char s3='A';
 for(int k=1;k<=n-1;k++)
 System.out.print(" ");
 System.out.print(s3);
 }
 }

