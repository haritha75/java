//print G shape
public class G_Shape
{
public static void main(String args[])
{
int arr[][]={
    {2,5,8,0,9,8,5},
    {1,4,7,9,3,1,2},
    {2,5,8,9,2,4,6},
    {3,5,7,9,0,1,5},
    {1,3,6,8,9,0,2},
    {1,4,7,9,0,2,6},
    {2,4,6,8,0,1,5}
    };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++)
    {
    if(i==0&&j<=n/2||j==0||i==n-1&&j<=n/2||i==n/2&&j>=n/2||i>=n/2&&j==n/2||i>=n/2&&j==n-1)
    System.out.print(arr[i][j]+" ");
    else
    System.out.print("  ");
    }
    System.out.println();
    }
    }
    }
