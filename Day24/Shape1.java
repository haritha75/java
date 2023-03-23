public class Shape1
{
public static void main(String args[])
{
int arr[][]={
    {2,8,5,4,1,7,3},
    {0,1,5,2,7,1,4},
    {8,0,1,4,6,0,3},
    {4,6,1,7,9,5,2},
    {5,2,1,6,9,7,9},
    {1,4,2,6,4,8,0},
    {2,6,4,7,6,8,1}
    };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    if(i==0||i%2==0)
    {
    for(int j=0;j<n;j++)
    {
    System.out.print(arr[i][j]+" ");
    }
    }
    else
    {
    for(int k=n-1;k>=0;k--)
    {
    System.out.print(arr[i][k]+" ");
    }
    }
    System.out.println();
    }
   }
  }
 
