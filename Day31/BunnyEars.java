//We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
public class BunnyEars
{
public static void main(String args[])
{
int n=6;
int res=Bunny(n);
System.out.print(res);

}
static int Bunny(int n)
{
if(n==0)//base condition
return 0;
if(n==1)//base condition
return 2;
int a=2+Bunny(n-1);
return a;
}
}
