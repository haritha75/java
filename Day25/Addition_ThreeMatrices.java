//print addition of Three matrices
public class Addition_ThreeMatrices
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
    
int c[][]={
    {3,7,6,1,9},
    {7,0,9,1,4},
    {1,9,5,3,2},
    };
 
  int res[][]=new int[a.length][a[0].length];
  for(int i=0;i<a.length;i++)
  {
  for(int j=0;j<a[0].length;j++)
  {
     res[i][j]=a[i][j]+b[i][j]+c[i][j];
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
     
