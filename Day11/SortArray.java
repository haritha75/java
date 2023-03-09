//sort the array zeroes,ones and twos
import java.util.Arrays;
public class SortArray
{
public static void main(String args[])
{
int arr[]={1,0,2,0,0,1,2,1,0,2,0,2,1,1};
int zeroes=0,ones=0,twos=0;
for(int i=0;i<=arr.length-1;i++)
{
if(arr[i]==0)
zeroes++;
else if(arr[i]==1)
ones++;
else
twos++;
}
System.out.println(zeroes);
System.out.println(ones);
System.out.println(twos);
for(int i=0;i<zeroes;i++)
arr[i]=0;
for(int j=zeroes;j<zeroes+ones;j++)
arr[j]=1;
for(int k=zeroes+ones;k<arr.length;k++)
arr[k]=2;

System.out.print(Arrays.toString(arr));
}
}
