//print the which row is highest and what is the sum of row
public class Row_Greatest
{
public static void main(String args[])
{
int a[][]={
     {2,6,8,1},
     {7,9,3,2},
     {1,2,7,9}
     };
     int ind=-1;int Max=Integer.MIN_VALUE;
     for(int i=0;i<a.length;i++)
     {
     int sum=0;
     for(int j=0;j<a[0].length;j++)
     {
     sum+=a[i][j];
     }
     if(sum>Max)
     {
     Max=sum;
     ind=i;
     }
     }
     System.out.print(ind+" "+Max);
     }
     }
