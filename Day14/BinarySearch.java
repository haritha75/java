// search element in the array using binary search
public class BinarySearch
{
public static void main(String args[])
{
int x=2;
int arr[]={1,2,5,6,7,8,9};
int n=arr.length;
int beg=0,end=n-1;
while(beg<=end)
{
int mid=beg+end/2;
if(arr[mid]==x)
{
System.out.println("elemnt found at index "+mid);
return;
}
else if(arr[mid]<x)
{
beg=mid+1;
}
else if(arr[mid]>x)
{
end=mid-1;
}
}
System.out.println("element not found");
}
}
