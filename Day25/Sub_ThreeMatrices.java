//print Substrction of Three matrices
public class Sub_ThreeMatrices
{
public static void main(String args[])
{
int a[][]={
    {3,6,2,8,9},
    {2,8,1,5,9},
    {3,5,0,7,9}
    };

int b[][]={
    {1,7,1,9,4},
    {4,6,1,3,8},
    {2,5,8,7,0}
    };
    
int c[][]={
    {3,6,1,0,9},
    {7,3,0,1,4},
    {2,9,5,0,6},
    };
 
  int r[][]=new int[a.length][a[0].length];
  for(int i=0;i<a.length;i++)
  {
  for(int j=0;j<a[0].length;j++)
  {
     r[i][j]=a[i][j]-b[i][j]-c[i][j];
     }
     }
     for( var x:r)
     {
     for(var y:x)
     System.out.print(y+" ");
     System.out.println();
     }
   }
 }
     
