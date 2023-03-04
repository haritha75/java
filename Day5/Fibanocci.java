//write a program to print fibanacci series of n terms where n is input by user.
import java.util.Scanner;
public class Fibanocci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=0,n2=1,n3;
System.out.println(n1);
System.out.println(n2);
for(int i=1;i<=n;i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}
