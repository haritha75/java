//print x shape using arrays
public class X_Shape
{
public static void main(String args[])
{
int arr[][]={
     {3,7,9,1,0,6,1},
     {1,2,5,8,3,7,2},
     {3,6,8,0,1,0,3},
     {1,6,4,7,8,6,2},
     {2,4,5,8,0,7,3},
     {2,6,8,0,2,5,4},
     {1,5,7,9,3,4,2}
     };
     int n=arr.length;
     for(int i=0;i<=n-1;i++)
     {
     for(int j=0;j<=n-1;j++)
     {
     if(i==j&&i<=n-1||j==n-i-1&&i<=n-1)
     System.out.print(arr[i][j]+" ");
     else
     System.out.print("  ");
     }
     System.out.println();
     }
     }
     }
