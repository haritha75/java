public class SumArray {
public static void main(String args[])
{
int arr[]={2,6,4,8,3,1,3,9,2,5};
int sum=6;
int c=0;
for(int i=0;i<arr.length-1;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]+arr[j]==sum)
{
    c++;
}
}
}
System.out.println(c);


}
}


