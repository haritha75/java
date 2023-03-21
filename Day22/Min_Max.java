//write a program on maximum difference between two elements such that  larger element appears after the smaller number.
public class Min_Max
{
public static void main(String args[])
{
int a[]={3,2,11,1,9,7};
int Min=0,Max=0;
for(int i=1;i<a.length;i++)
{
if(a[i]<a[Min])
{
a[Min]=a[i];
Max=0;
}
int diff=a[i]-a[Min];
if(diff>Max)
Max=diff;
}
System.out.println(Max);
}
}
