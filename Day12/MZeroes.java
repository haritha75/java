//move all zeroes to end of array
import java.util.Arrays;
public class MZeroes
{
public static void main(String args[])
{
int arr[]={-1,2,4,0,0,2,6,0,0,1,0};
int n=arr.length;
int arr2[]=new int[n];
int j=0;
for(int i=0;i<=n-1;i++)
{
if(arr[i]!=0)
arr2[j++]=arr[i];
}
while(j<=n-1)
{
arr2[j++]=0;
}
System.out.print(Arrays.toString(arr2));
}
}

