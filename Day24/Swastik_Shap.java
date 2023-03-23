//print the swastik shape in array
public class Swastik_Shap
{
public static void main(String args[])
{
int arr[][]={
   {2,7,4,2,1},
   {1,9,3,7,4},
   {2,6,8,0,2},
   {3,6,7,1,2},
   {5,8,9,1,3},
   };
   int n=arr.length;
   for(int i=0;i<1;i++)
   {
   for(int j=0;j<arr[i].length;j++)
   {
   if(j<=n/2&&i==0||j==arr[i].length-1&&i==0)
   System.out.print(arr[i][j]+" ");
   else
   System.out.print("  ");
   }
   System.out.println();
   }
   for(int i=1;i<=n/3;i++)
   {
   int j,k;
   for(j=0;j<n/2;j++)
   System.out.print("  ");
   System.out.print(arr[i][j]+" ");
   for(k=n/2+1;k<arr[i].length-1;k++)
   System.out.print("  ");
   System.out.print(arr[i][k]+" ");
   }
   System.out.println();
  
   for(int i=n/2;i<=n/2;i++)
   {
   for(int j=0;j<arr[i].length;j++)
   System.out.print(arr[i][j]+" ");
   }
   System.out.println();
   for(int i=n/2+1;i<n-1;i++)
   {
   for(int j=0;j<=n/2;j++)
   if(j==0||j==n/2)
   System.out.print(arr[i][j]+" ");
   else
   System.out.print("  ");
   for(int k=n/2+1;k<=n-1;k++)
   System.out.print(" ");
   }
   System.out.println();
   for(int i=n-1;i<=n-1;i++)
   {
   for(int j=0;j<=n-1;j++)
   {
   if(j==0&&i==n-1||j>=n/2)
   System.out.print(arr[i][j]+" ");
   else
   System.out.print("  ");
   }
   System.out.println();
   }
   }
   }
   

