//print the diagonal shape in array.
public class Diagonal_Shape
{
public static void main(String args[])
{
int a[][]={
      {2,4,6,7},
      {1,6,8,0},
      {1,4,5,7},
      {3,5,1,0}
      };
      int n=a.length;
      for(int i=0;i<a.length;i++)
      {
      for(int j=0;j<a[i].length;j++)
      {
      if(i==j||j==n-i-1)
      System.out.print(a[i][j]+" ");
      else
      System.out.print(" ");
      }
      System.out.println();
      }
      }
      }
