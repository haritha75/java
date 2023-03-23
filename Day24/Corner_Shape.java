//print the conrner shape in array
public class Corner_Shape
{
public static void main(String args[])
{
int arr[][]={
    {1,3,5,2,7},
    {4,1,7,1,3},
    {7,9,2,5,6},
    {1,6,2,8,9},
    {4,9,1,5,2}
    };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<arr[i].length;j++)
    {
    if(i==0&&j==0||j==arr[i].length-1&&i==0||j==0&&i==n-1||i==n-1&&j==arr[i].length-1)
    System.out.print(arr[i][j]+" ");
    else
    System.out.print("  ");
    }
    System.out.println();
    }
    }
    }
    
