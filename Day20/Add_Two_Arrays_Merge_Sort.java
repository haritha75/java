//write a program on merging and sorting two arrays.
import java.util.Arrays;
public class Add_Two_Arrays_Merge_Sort
{
public static void main(String args[])
{
int a[]={2,3,4,8};
int b[]={1,5,6,7,9,12};
int i,j,k;
int c[]=new int[a.length+b.length];
for( i=0,j=0,k=0;i<a.length && j<b.length;)
{
if(a[i]>b[j])
{
c[k++]=b[j++];
}
else
{
c[k++]=a[i++];
}
}
while(i<a.length)
{
c[k++]=a[i++];
}
while(j<b.length)
{
c[k++]=b[j++];
}
System.out.println(Arrays.toString(c));
}
}
