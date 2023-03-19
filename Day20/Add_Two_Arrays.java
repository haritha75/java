//write a program on sum of two equal arrays
public class Add_Two_Arrays
{
public static void main(String args[])
{
int a[]={2,3,4,5};
int b[]={1,3,5,6};
int s=0;
for(int i=0,j=0;i<a.length && j<b.length;i++,j++)
{
s+=a[i]+b[j];
}
System.out.print(s);
}
}
