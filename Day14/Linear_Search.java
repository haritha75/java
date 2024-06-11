//search the given element using linear search
public class Linear_Search
{
public static void main(String args[])
{
int n=7;
int arr[]={3,8,7,1,4};
for(int i=0;i<arr.length;i++)
{
if(arr[i]==n)
{
System.out.println("elemnt found at index " +i);
return;
}
}
System.out.println("element not found");
}
}
