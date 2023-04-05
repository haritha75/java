//print the array elements

public class EleArray
{
public static void main(String args[])
{
int a[]={14,1,2,5,7,8,0};
eleArray(a,0);
}
static void eleArray(int a[],int stInd)
{
if(stInd==a.length)
return;
System.out.print(a[stInd]+" ");
eleArray(a,stInd+1);
return;
}
}
