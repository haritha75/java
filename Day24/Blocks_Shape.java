//print Blocks shape using arrays
public class Blocks_Shape
{
public static void main(String args[])
{
int arr[][]={
     {3,7,9,0,1,2,6},
     {1,2,5,7,3,0,3},
     {3,6,8,6,1,6,1},
     {2,5,1,7,3,9,5},
     {2,5,8,0,2,4,3},
     {4,5,8,0,2,5,1},
     {5,1,4,6,8,0,3}
     };
     int n=arr.length;
     for(int i=0;i<=n-1;i++)
     {
     for(int j=0,l=1;j<=n-1;j++,l+=2)
     {
     if(i==0||j==0||i==n-1||i==n/2||j==n/2||j==n-1)
     System.out.print(arr[i][j]+" ");
     else
     System.out.print("  ");
     }
     System.out.println();
     }
     }
     }
