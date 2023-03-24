//print N shape
public class N_Shape
{
public static void main(String args[])
{
int arr[][]={
    {2,8,5,6,9,1,0},
    {1,3,5,7,9,0,2},
    {4,5,7,9,0,2,5},
    {1,3,4,6,8,9,3},
    {1,3,5,7,9,0,2},
    {5,7,8,9,2,1,5},
    {2,7,5,4,0,8,1}
    };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++)
    {
    if(j==0||j==n-1||j==i)
    System.out.print(arr[i][j]+" ");
    else
    System.out.print("  ");
    }
    System.out.println();
    }
    }
    }
