//find the peek element in array
public class  PeekEle
{
public static void main(String args[])
{
int arr[]={3,6,1,8,3,6,21};
if(arr.length==0)
{
return;
}
if(arr.length==1)
{
System.out.print(arr[0]);
}
for(int i=1;i<arr.length-1;i++)
{
if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
{
System.out.println(arr[i]);
}
}
if(arr[arr.length-1]>arr[arr.length-2])
{
System.out.println(arr[arr.length-1]);
}
}
}

