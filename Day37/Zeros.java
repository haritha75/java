//print the zeros first after ones
import java.util.*;
public class Zeros
{
public static void main(String args[])
{
int a[]={1,0,1,1,0,1,0,0,1,1,0,0,0};
int zeros=0;
int ones=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==0)
zeros++;
else
ones++;
}
int i;
for(i=0;i<zeros;i++)
{
a[i]=0;
}
while(i<a.length)
{
a[i++]=1;
}
System.out.println(Arrays.toString(a));
}
}

