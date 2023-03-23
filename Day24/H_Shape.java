// print the H shape in array
public class H_Shape
{
public static void main(String args[])
{
int arr[][]={
    {1,5,9,3},
    {2,6,0,4},
    {3,7,1,5},
    {4,8,2,6},
    {1,3,1,5},
    {2,7,1,8},
    {3,5,7,9}
    };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<arr[i].length;j++)
    {
    if(j==0||j==arr[i].length-1||i==n/2)
    {
    System.out.print(arr[i][j]+" ");
    }
    else
    {
    System.out.print("  ");
    }
    }
    System.out.println();
   }
  }
 }
    
    
