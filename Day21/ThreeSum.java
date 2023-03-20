//write a program on sum of three elements are equal or not  to the given number
public class ThreeSum
{
public static void main(String args[])
{
int arr[]={2,6,9,10,2,5,1,8},sum=12;
for(int i=0;i<arr.length-2;i++)
{
for(int j=i+1;j<arr.length-1;j++)
{
for(int k=j+1;k<arr.length;k++)
{
if(arr[i]+arr[j]+arr[k]==sum)
{
System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
}
}
}
}
}
}
