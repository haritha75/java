//print the missing value in array
public class MissingValue
{
public static void main(String args[])
{
int n=8;
int arr[]={2,4,5,6,1,8,3};
for(int i=1;i<=n;i++)
{
int count=0;
for(int j=0;j<arr.length;j++)
{
if(arr[j]==i)
{
count++;
break;
}
}
if(count==0)
{
System.out.print(i);
}
}
}
}

