//find out the leaders in array
public class RevLeaders
{
public static void main(String args[])
{
int arr[]={4,12,9,4,5,7,2};
int n=arr.length;
int max=arr[n-1];
for(int i=n-1;i>=0;i--)
{
if(arr[i]>=max)
{
max=arr[i];
System.out.print(arr[i]+" ");
}
}
}
}
