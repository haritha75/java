public class Shape
{
public static void main(String args[])
{
int arr[][]={
      {2,6,3,1,5,1,4},
      {9,7,5,1,3,9,7},
      {4,6,5,1,2,0,1},
      {7,0,2,1,4,7,4},
      {5,7,1,6,2,2,4},
      {2,6,4,1,5,3,8},
      {1,9,0,3,5,2,2}
      };
      int n=arr.length;
      for(int i=0;i<1;i++)
      {
      for(int j=0;j<n;j++)
      {
      if(j<=n/2||j==n-1)
      System.out.print(arr[i][j]+" ");
      else
      System.out.print("  ");
      }
      }
      System.out.println();
      for(int i=1;i<=n-2;i++)
      {
      for(int j=0;j<=n-1;j++)
      {
      if(j==0||j==n/2||j==n-1)
      System.out.print(arr[i][j]+" ");
      else
      System.out.print("  ");
      }
      System.out.println();
      }
      for(int i=n-1;i<=n-1;i++)
      {
      for(int j=0;j<=n-1;j++)
      {
      if(j==0||j>=n/2)
      System.out.print(arr[i][j]+" ");
      else
      System.out.print("  ");
      }
      System.out.println();
      
      }
      }
      }
      
      
  
