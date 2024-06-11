//write a program on armstrong number using recursion
public class ArmStrong
{
public static void main(String args[])
{
int m=153;
int n=m;
int sum=0;
System.out.println(armStrong(n,sum,m));
}

static boolean armStrong(int n,int sum,int m)
{
if(n==0)
return false;
int r=n%10;
sum+=r*r*r;
if(m==sum)
return true;
return armStrong(n/10,sum,m);

}
}

