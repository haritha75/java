// print thepattern

/*

A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 

 */
 public class CharPattern1
 {
 public static void main(String args[])
 {
 int n=5;
 char s='A';
 for(int i=1;i<=n;i++)
 {
 for(int j=1;j<=i;j++)
 System.out.print(s +" ");
 System.out.println();
 s++;
 }
 }
 }
