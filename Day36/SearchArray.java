//print the index of the given  element  and from the array at starting element  using recursion


public class SearchArray
{
public static void main(String args[])
{
int a[]={14,7,1,2,5,7,8,0};
int x=7;
System.out.print(searchArray(a,0,x));
}
static int searchArray(int a[],int stInd,int x)
{
if(stInd==a.length)
return -1;
if(a[stInd]==x)
return stInd;
return searchArray(a,stInd+1,x);
}
}
