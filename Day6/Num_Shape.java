//ptint the pattern 

/*

7 6 5 4 3 2 1 0 
6 5 4 3 2 1 0   
5 4 3 2 1 0     
4 3 2 1 0       
3 2 1 0         
2 1 0           
1 0             
0  

*/
public class Num_Shape
{
public static void main(String args[])
{
 int n=8;
 for(int i=1;i<=n;i++)
 {
 int k=n-i;
 for(int j=1;j<=n-i+1;j++)
 {
 System.out.print(k+" ");
 k--;
 }
 System.out.println();
 }
 }
 }
 
