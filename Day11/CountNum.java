//how many time 4th number repeated in array
import java.util.Arrays;
public class CountNum
{
public static void main(String args[])
{
int arr[]={2,4,7,4,9,10,4,11,66,4};
int count=0;
Arrays.sort(arr);
for(int i=0;i<=arr.length-1;i++)
{
if(arr[i]==4)
count++;
if(arr[i]>4)
break;
}
System.out.print(count);
}
}

