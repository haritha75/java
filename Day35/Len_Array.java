//take an array and find the length of the array.
import java.util.Arrays;
public class Len_Array
{
public static void main(String args[])
{
int arr[]={1,2,3,6,8,2,4};
System.out.println(lenArray(arr,0));
}
static int lenArray(int arr[],int n){
if(n==arr.length)
return 0;
return 1+(lenArray(arr,n+1));
}}
