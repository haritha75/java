//write a program on maximum difference between two elements such that  larger element appears after the smaller number.
public class Min_Right_MaxDiff
{
public static void main(String args[])
{
int a[]={3,6,8,2,1,7,3,6,9};
int small=0;
for(int i=1;i<a.length;i++)
{
if(a[i]<a[small])
small=i;
}
int max=small+1;
for(int j=small+2;j<a.length;j++)
{
if(a[j]>a[max])
max=j;
}
int diff=a[max]-a[small];
System.out.println(diff);
}
}
