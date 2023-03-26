//write a code on multiplication of two matrices
public class Mul_Two_Matrices
{
public static void main(String args[])
{
int a[][]={
    {2,4,7},
    {1,6,0}
    };

int b[][]={
    {1,7},
    {3,8},
    {4,9}
    };
    
int c[][]=new int[a.length][b[0].length];
for(int i=0;i<a.length;i++)//1 matrices
{
for(int j=0;j<b[0].length;j++)//2nd matrices 
{
for(int k=0;k<a[0].length;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
}
for(var x:c)
{
for(var y:x)
System.out.print(y+" ");
System.out.println();
}
}
}
        
