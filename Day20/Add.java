// write a program on sum of two arrays
import java.util.Arrays;
public class Add
{
public static void main(String args[])
{
int a[]={2,5,7};
int b[]={1,5,6};
int c[]=new int[b.length];
int i=a.length-1;
int j=b.length-1;
int k=0,z=1;
while(i>=0&&j>=0)
{
int s=a[i]+b[j]+k;
k=s/10;
c[c.length-z]=s%10;
z++;
i--;
j--;
}
System.out.print(Arrays.toString(c));
}
}
