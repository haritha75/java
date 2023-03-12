//print the fist repeating value in the arrat
public class FirstRepeatedValue
{
public static void main(String args[])
{
int arr[]={1,5,8,3,8,7,3,7};
int n=arr.length;
int count=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
System.out.print(arr[j]);
return;
}
}
}
}
}
