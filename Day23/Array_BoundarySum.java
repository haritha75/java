//write a program on array boundary shape
public class Array_BoundarySum
{
public static void main(String args[])
{
int arr[][]={
     {2,4,7,8,2},
     {3,6,1,7,9},
     {1,8,2,5,11},
     {0,2,5,1, }
     };
     System.out.println(arr[1].length);
     int sum=0;
     for(int i=0;i<arr.length;i++)
     {
     for(int j=0;j<arr[i].length;j++)
     {
     if(i==0||j==0||j==arr[i].length-1||i==arr.length-1)
     {
     sum+=arr[i][j];
     }
     }
     }
     System.out.print(sum);
   }
  }
