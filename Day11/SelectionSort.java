//sort the array using selection sort
import java.util.Arrays;
public class SelectionSort
{
public static void main(String args[])
{
int arr[]={3,6,8,10,4,7,2};
int len=arr.length;
for(int i=0;i<=len-1;i++)
{
for(int j=i+1;j<=len-1;j++)
if(arr[i]>arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
System.out.print(Arrays.toString(arr));
}
}


