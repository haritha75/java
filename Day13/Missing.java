//print the missing element
public class Missing
{
public static void main(String args[])
{
int arr[]={21,22,24,25};
for(int i=21;i<26;i++)
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
