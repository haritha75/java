//print  the revsed array
import java.util.Arrays;
public class RevArray1
{
public static void main(String args[])
{
int arr1[]={3,7,1,5,9,2};
int arr2[]=new int [arr1.length];
for(int i=arr1.length-1,j=0;i>=0;i--,j++)
arr2[j]=arr1[i]; 
System.out.print(Arrays.toString(arr2));
}
}
