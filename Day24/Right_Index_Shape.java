//print right index element
public class Right_Index_Shape
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
    for(int j=0;j<n-i-1;j++)
    System.out.print("  ");
    for(int k=n-i-1;k<=n-1;k++)
    System.out.print(arr[i][k]+" ");
     System.out.println(); 
    }
    }
    }
    
    
    
   
