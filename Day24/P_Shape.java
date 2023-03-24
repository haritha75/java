//print the p shape using array
public class P_Shape
{
public static void main(String args[])
{
int arr[][]={
    {2,6,8,0,1,6,8},
    {6,0,2,5,4,0,1},
    {1,3,6,8,0,4,7},
    {2,5,1,7,8,9,2},
    {1,4,7,9,3,1,4},
    {6,4,1,0,5,7,8},
    {2,5,8,0,1,2,6}
    };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<arr[0].length;j++)
    {
    if(i==0||i==n/2||j==0||j==n-1&&i<=n/2)
    System.out.print(arr[i][j]+" ");
    else
    System.out.print("  ");
    }
    System.out.println();
    }
    }
    }
    
