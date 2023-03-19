//write a program on sum of two not equal arrays
public class Add_Two_Arrays1
{
public static void main(String args[])
{
int a[]={2,3,4,5};
int b[]={1,3,5,6,4,7,9};
int s=0;
int i,j;
for( i=0,j=0;i<a.length && j<b.length;i++,j++)
{
s+=a[i]+b[j];
}
while(i<a.length)
{
s+=a[i++];
}
while(j<b.length)
{
s+=b[j++];
}
System.out.print(s);
}
}
