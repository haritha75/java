//print the maximum and minimum values in arrays
public class MaxAndMin
{
public static void main(String args[])
{
int arr[]={3,66,21,53,2,-4,-1};
int Max=Integer.MIN_VALUE;
int Min=Integer.MAX_VALUE;
for(var a:arr)
{
if(a>Max)
Max=a;
if(a<Min)
Min=a;
}
System.out.print("max="+Max+"min="+Min);
}
}

