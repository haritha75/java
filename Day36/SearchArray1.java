//print the index of the given  element  and from the array at ending element  using recursion


public class SearchArray1
{
public static void main(String args[])
{
int a[]={14,7,1,2,5,7,8,0};
int x=7;
System.out.print(searchArray(a,a.length-1,x));
}
static int searchArray(int a[],int endInd,int x)
{
if(endInd<0)
return -1;
if(a[endInd]==x)
return endInd;
return searchArray(a,endInd-1,x);
}
}
