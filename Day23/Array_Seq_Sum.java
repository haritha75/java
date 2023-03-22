//print the sum of array boundary elements
public class Array_Seq_Sum
{
public static void main(String args[])
{
int arr[][]={
       {1,6,3,5,2},
       {2,9,2,1,3},
       {6,8,2,8,0},
       {9,1,2,4,8}
       };
       System.out.println(arr.length);
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
       for(int j=0;j<arr[i].length;j++)
       {
       if(i==0||j==arr[i].length-1)
       {
       System.out.print(arr[i][j]);
       sum+=arr[i][j];
       //System.out.println(sum);
       }
       }
       }
       for(int i=0;i<arr.length;i++)
       {
       for(int j=arr[i].length-2;j>=0;j--)
       {
       if(i==arr.length-1)
       {
       System.out.print(arr[i][j]);
       sum+=arr[i][j];
       }
       }
       }
       for(int i=arr.length-2;i>0;i--)
       {
       for(int j=0;j<arr[i].length;j++)
       {
       if(i==0||j==0)
       {
       System.out.print(arr[i][j]);
       sum+=arr[i][j];
       }
       }
       }
       System.out.println();
       System.out.println(sum);
       }
       }
