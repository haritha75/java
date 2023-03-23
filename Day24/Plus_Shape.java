//print the plus shape in array
public class Plus_Shape
{
public static void main(String args[])
{
int arr[][]={
     {2,1,7,2,4},
     {3,7,1,0,2},
     {1,6,4,2,5},
     {2,9,8,1,4},
     {1,5,2,7,9}
     };
     int n=arr.length;
     for(int i=0;i<arr.length;i++)
     {
     for(int j=0;j<arr[i].length;j++)
     {
     if(j==n/2||i==n/2)
     System.out.print(arr[i][j]+" ");
     else   
     System.out.print("  ");
     }
     System.out.println();
     }
     }
     }
     

