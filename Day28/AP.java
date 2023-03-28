//check whether arthmetic progression can be formed from the given arrya.
import java.util.Arrays;
public class AP
{
public static void main(String args[])
{
int a[]={0,8,12,4};
Arrays.sort(a);
int diff=a[0]-a[1];
System.out.println(diff);
for(int i=1;i<a.length-1;i++)
{
if(a[i]-a[i+1]!=diff)
{
System.out.print("not AP");
return;
}
}
System.out.print("AP");
}
}
