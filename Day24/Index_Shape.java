//print left index array
public class Index_Shape
{
public static void main(String args[])
{
int arr[][]={
    {2,6,4,8,1},
    {4,7,9,0,1},
    {1,5,3,7,2},
    {1,6,5,4,9},
    {8,6,0,1,4}
    };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<=i;j++)
    {
    System.out.print(arr[i][j]+" ");
    }
    System.out.println();
    }
    }
    }
    
   
