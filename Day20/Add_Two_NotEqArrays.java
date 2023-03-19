//write a program on sum of two not equal arrays.
import java.util.Arrays;
public class Add_Two_NotEqArrays
{
public static void main(String args[])
{
int a[]={2,5,7};
int b[]={5,2,9,5,6};
int max=a.length>b.length?a.length:b.length;

int c[]=new int[max];
int i=a.length-1;
int j=b.length-1;
int k=0,z=1,s;
while(i>=0&&j>=0)
{
s=a[i]+b[j]+k;
k=s/10;
c[c.length-z]=s%10;
z++;
i--;
j--;
}
if(a.length==b.length)
{
System.out.print(Arrays.toString(c));
return;
}
else if(a.length>b.length)
{
while(i>=0)
{
s=a[i]+k;
c[c.length-z]=s%10;
k=s/10;
z++;
i--;
}
}
else
{
while(j>=0)
{
s=b[j]+k;
c[c.length-z]=s%10;
k=s/10;
z++;
j--;
}
}
System.out.print(Arrays.toString(c));
}
}
