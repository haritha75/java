//print the start to given number
public class StartToNum
{
public static void main(String args[])
{
int n=14;
startNum(n,1);
}
static void startNum(int n,int start)
{
if(start>n)
return;
System.out.print(start+" ");
startNum(n,start+1);
return;
}
}
