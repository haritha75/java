//print index of the given index using binary search using recursion
public class BinarySearch
{
public static void main(String args[])
{
int a[]={1,2,4,5,7,8,9};
int x=5;
int res=binarySearch(a,x,0,a.length-1);
System.out.print(res);
}
static int binarySearch(int a[],int x,int beg,int end)
{
if(!(beg<=end))
return -1;
int mid=(beg+end)/2;
if(a[mid]==x)
return mid;
else
{
if(a[mid]<x)
{
beg=mid+1;
return binarySearch(a,x,beg,end);
}
else
{
end=mid-1;
return binarySearch(a,x,beg,end);
}
}
}
}

