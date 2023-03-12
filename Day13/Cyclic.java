//print the array cyclic by 1
import java.util.Arrays;
public class Cyclic
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5,6,7};
int backup=arr[arr.length-1];
for(int i=arr.length-2;i>=0;i--)
{
arr[i+1]=arr[i];

}
arr[0]=backup;
System.out.print(Arrays.toString(arr));
}
}

