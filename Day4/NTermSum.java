//write a program in java to display n terms of natural number and their sum.
import java.util.Scanner;
public  class NTermSum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
System.out.println(i);
sum+=i;
}
System.out.println(sum);
}
}
