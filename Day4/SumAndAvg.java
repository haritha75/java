//write  a program in java to read 10 numbers from keyboard and find their sum and average.
import java.util.Scanner;
public class SumAndAvg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s=0;
for(int i=1;i<=10;i++)
{
int n=sc.nextInt();
s+=n;
}
float avg=s/10;
System.out.println("sum of number" +s);
System.out.println("average of number" +avg);
}
}

