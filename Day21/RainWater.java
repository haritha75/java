//write a program on tracking rain water
import java.util.*;
public class  RainWater
{
public static void main(String args[])
{
int totwater=0;
int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
for(int i=1;i<arr.length-1;i++)
{
int leftMax=arr[i];
for(int j=0;j<i;j++)
{
if(arr[j]>leftMax)
leftMax=arr[j];
}
int rightMax=arr[i];
for(int k=i+1;k<arr.length;k++)
{
if(arr[k]>rightMax)
rightMax=arr[k];
}
int min=Math.min(leftMax,rightMax);
int water=min-arr[i];
totwater+=water;
}
System.out.println("Rain water :"+totwater);
}
}																																																																																																																																																																																																																																																																																										
