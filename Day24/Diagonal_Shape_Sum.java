//prin the sum of diagonal elements
public class Diagonal_Shape_Sum
{
public static void main(String args[])
{
int a[][]={
      {2,4,6,7},
      {1,6,8,0},
      {1,4,5,7},
      {3,5,1,0}
      };
      int n=a.length, firstSum=0,
      secondSum=0;
      for(int i=0;i<a.length;i++)
      {
      for(int j=0;j<a[i].length;j++)
      {
      if(i==j)
      firstSum+=a[i][j];
      else if(j==n-i-1)
      secondSum+=a[i][j];
      }
      System.out.println();
      }
      System.out.print(firstSum+" "+secondSum);
      }
      }
