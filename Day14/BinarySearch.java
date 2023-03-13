// search element in the array using binary search
import java.util.Arrays;
public class BinarySearch
{
public static void main(String args[])
{
int x=2;
int arr[]={2,5,1,8,6,7,9};
Arrays.sort(arr);
int n=arr.length;
int beg=0,end=n-1;
while(beg<=end)
{
int mid=beg+end/2;
if(arr[mid]==x)
{
System.out.print("elemnt found at index "+mid);
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
System.out.print("element not found");
}
}
