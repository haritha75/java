//write a program using insertion sort.
import java.util.Arrays;
public class InsertionSort
{
public static void main(String args[])
{
int a[]={7,5,1,9,3};
int n=a.length;
for(int i=1;i<n;i++)
{
int key=a[i];
int j=i-1;
while(j>=0&&a[j]>key)
{
a[j+1]=a[j];
j--;
}
a[j+1]=key;
}
System.out.print(Arrays.toString(a));
}
}
