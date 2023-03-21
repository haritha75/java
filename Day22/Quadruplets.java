//write a program on sum of 4 elements equal or not given element.
public class Quadruplets
{
public static void main(String args[])
{
int sum=14;
int a[]={2,6,4,8,3,7,5,1};
for(int i=0;i<a.length-3;i++)
{
for(int j=i+1;j<a.length-2;j++)
{
for(int k=j+1;k<a.length-1;k++)
{
for(int l=k+1;l<a.length;l++)
{
if(a[i]+a[j]+a[k]+a[l]==sum)
{
System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]);
//return;
}
}
}
}
}
}
}
