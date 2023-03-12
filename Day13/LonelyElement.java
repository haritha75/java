//prinnt the lonely element in array
//always take odd array
public class LonelyElement
{
public static void main(String args[])
{
int arr[]={2,8,5,1,8,5,2};
int res=arr[0];
for(int i=1;i<arr.length;i++)
{
res=res^arr[i];
}
System.out.print(res);
}
}
