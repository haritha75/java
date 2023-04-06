//print the zeros first after ones
import java.util.*;
public class ZerosAndOnes
{
public static void main(String args[])
{
int a[]={1,0,1,1,0,1,0,0,1,1,0,0,0};
int sum=0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];
}
int zeros=a.length-sum;
int ones=sum;
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

