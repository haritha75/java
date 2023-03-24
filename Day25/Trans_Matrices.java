//print the trasposition matrice of given matrice.
public class Trans_Matrices
{
public static void main(String args[])
{
int a[][]={
    {2,6,8,1},
    {6,9,0,1},
    {2,7,1,8}
    };
    int m=a.length;//rows
    int n=a[0].length;//col's
    
int b[][]=new int[n][m];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
  b[i][j]=a[j][i];
}
}
for(var x:b)
{
for(var y:x)
System.out.print(y+" ");
System.out.println();
}   
}
}
