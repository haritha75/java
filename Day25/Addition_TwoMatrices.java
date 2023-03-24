//print addition of two matrices
public class Addition_TwoMatrices
{
public static void main(String args[])
{
int a[][]={
    {2,6,1,8,0},
    {1,8,2,5,9},
    {3,5,7,7,4}
    };

int b[][]={
    {2,7,1,0,4},
    {1,6,9,3,6},
    {3,5,8,0,1}
    };
    
  if(!(a.length==b.length)||!(a[0].length==b[0].length))
  {
  System.out.print("addition of two matrices not possible:");
  return;
  }
  int res[][]=new int[a.length][a[0].length];
  for(int i=0;i<a.length;i++)
  {
  for(int j=0;j<a[0].length;j++)
  {
     res[i][j]=a[i][j]+b[i][j];
     }
     }
     for( var x:res)
     {
     for(var y:x)
     System.out.print(y+" ");
     System.out.println();
     }
   }
 }
     
