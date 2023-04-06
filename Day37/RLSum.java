//print the equilibtium index of right sum and left sum
public class RLSum
{
public static void main(String args[])
{
int a[]={3,4,1,2,3,2};
for(int i=0;i<a.length;i++)
{
int lSum=0;
int rSum=0;
for(int j=0;j<i;j++)
lSum+=a[j];
for(int j=i+1;j<a.length;j++)
rSum+=a[j];
if(lSum==rSum)
{
System.out.print(i);
return;
}
}
System.out.println(-1);
}
}
