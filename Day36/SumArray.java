//print  sum of the array elements using recursion

public class SumArray
{
public static void main(String args[])
{
int a[]={14,1,2,5,7,8,0};
System.out.print(sumArray(a,0));
}
static int sumArray(int a[],int stInd)
{
if(stInd==a.length)
return 0;
return a[stInd]+sumArray(a,stInd+1);
}
}
