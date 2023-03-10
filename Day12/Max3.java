//print the largest of 3 values in array
public class Max3
{
public static void main(String args[])
{
int arr[]={3,6,8,1,2,4,95};
int max1=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;
int max3=Integer.MIN_VALUE;
for(int i=0;i<=arr.length-1;i++)
{
if(arr[i]>max1)
{
max3=max2;
max2=max1;
max1=arr[i];
}
else if(arr[i]>max2)
{
max3=max2;
max2=arr[i];
}
else if(arr[i]>max3)
{
max3=arr[i];
}
}
System.out.println("first largest element in the array:"+max1);
System.out.println("second largest element in the array:"+max2);
System.out.println("third largest element in the array:"+max3);
}
}

