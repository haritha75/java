//print right index elements in reverse.
public class Right_Index_Rev_Shape
{
public static void main(String args[])
{
int arr[][]={
    {1,6,4,8,5},
    {4,7,2,0,1},
    {1,5,1,7,0},
    {1,3,5,4,0},
    {8,6,0,1,2}
    };
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<n-i-1;j++)
    System.out.print("  ");
    for(int k=n-1;k>=n-i-1;k--)
    System.out.print(arr[i][k]+" ");
    System.out.println(); 
    }
    }
    }
    
    
    
   
