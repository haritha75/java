//intersection of given two arrays
public class Interesection
{
public static void main(String args[])
{
int a[]={1,4,7,9,2};
int b[]={2,6,8,1,3};
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i]==b[j])
{
System.out.println(a[i]+" ");
break;
}
}
}
}
}
