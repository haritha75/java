//wite a program on merging two arrays.
import java.util.Arrays;
public class Add_Two_Arrays_Merge
{
public static void main(String args[])
{
int a[]={2,3,4,5};
int b[]={1,3,5,6,4,7,9};
int s=0;
int i,j,h;
int c[]=new int[a.length+b.length];
for( i=0;i<a.length;i++)
{
c[i]=a[i];
}
for(j=i,h=0;j<a.length+b.length;j++)
{
c[j]=b[h++];
}
System.out.print(Arrays.toString(c));
}
}
