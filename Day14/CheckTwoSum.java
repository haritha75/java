//check the two sum elements are equal or not equal to the given element in array.
public class CheckTwoSum
{
public static void main(String args[])
{
int arr[]={2,6,4,8,3,1};
int sum=6;
for(int i=0;i<arr.length-1;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]+arr[j]==sum)
{
System.out.print("("+i+","+j+")");
return;
}
}
}
System.out.print("not equal to the sum");
}
}
