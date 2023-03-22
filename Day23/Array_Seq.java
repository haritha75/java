public class Array_Seq
{
public static void main(String args[])
{
int arr[][]={
       {2,6,3,7},
       {4,9,2,1},
       {1,8,2,6},
       {2,1,3,4}
       };
       System.out.println(arr.length);
       for(int i=0;i<arr.length;i++)
       {
       for(int j=0;j<arr[i].length;j++)
       {
       if(i==0||j==arr[i].length-1)
       System.out.print(arr[i][j]);
       }
       }
       for(int i=0;i<arr.length;i++)
       {
       for(int j=arr[i].length-2;j>=0;j--)
       {
       if(i==arr.length-1)
       System.out.print(arr[i][j]);
       }
       }
       for(int i=arr.length-2;i>0;i--)
       {
       for(int j=0;j<arr[i].length;j++)
       {
       if(i==0||j==0)
       System.out.print(arr[i][j]);
       }
       }
       }
       }
