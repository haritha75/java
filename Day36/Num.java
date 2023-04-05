//print  the given number to start number using recursion
public class Num
{
public static void main(String args[])
{
int n=12;
Num(n);
}
static void Num(int n)
{
if(n==0)
return;
System.out.print(n+" ");
Num(n-1);
return;
}
}
