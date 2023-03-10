//find out the leaders in array
public class Leaders
{
public static void main(String args[])
{
int arr[]={3,22,7,5,2,4};
int n=arr.length;
for(int i=0;i<=n-1;i++)
{
int count=0;
for(int j=i+1;j<=n-1;j++)
{
if(arr[i]<arr[j])
count++;
break;
}
if(count==0)
System.out.print(arr[i]+" ");
}
}
}

