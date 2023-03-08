// print reversed array
import java.util.Arrays;
public class RevArray
{
public static void main(String args[])
{
int arr[]={2,5,8,2,4,9};
int n=arr.length;
int b=arr.length-1;
for(int i=0;i<=n/2;i++)
{
int temp=arr[i];
arr[i]=arr[b];
arr[b]=temp;
b--;
}
System.out.print(Arrays.toString(arr));
}
}

