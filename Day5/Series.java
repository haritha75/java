//write a program to calculate the sum of following series where n is input by user.
import java.util.Scanner;
public class Series
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double s=0;
for(int i=1;i<=n;i++)
{
s+=1.0/i;
}
System.out.println(s);
}
}

