//print half pyramid
public class Py
{
public static void main(String args[])
{
int arr[][]={
     {2,5,7,8,9,0,1},
     {1,4,3,6,0,9,6},
     {2,5,1,6,4,1,4},
     {2,6,5,7,8,0,5},
     {1,2,4,5,7,2,6},
     {2,6,8,9,0,1,3},
     {1,6,5,3,7,8,9}
     };
     int n=arr.length;
     for(int i=0,l=n/2;i<=n/2;i++,l+=1)
     {
     for(int j=0;j<n/2-i;j++)
     System.out.print("  ");
     for(int k=n/2-i;k<=l;k++)
     System.out.print(arr[i][k]+" ");
     System.out.println();
     }
     }
     }
