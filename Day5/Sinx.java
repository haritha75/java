//write a program to compute sinx for given x.The user should supply x and a positive integer n.we compute the sine of x using the series and the computation should use all terms in the series up through the term involving x power n.
public class Sinx
{
public static void main(String args[])
{
int n=6;
int x=0;
double x1=x*(33.141592/180.0);
double res=0;
int sign=1;
for(int i=1,j=1;i<=n;i++,j+=2)
{
res+=(sign*Math.pow(x1,j))/fact(j);
sign*=-1;
}
System.out.print(res);
}
 static int fact(int n)
 {
int res=1;
for(int i=1;i<=n;i++)
res=res*i;
return res;
}
}
