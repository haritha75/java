//two numbers are entered through the keyboard.write a program to find the value of one number raised to the power of another.(Do not use java built-in method).
import java.util.Scanner;
public class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int b;
int p;
int r=1;
System.out.println("enter base:");
b=sc.nextInt();
System.out.println("enter power:");
p=sc.nextInt();
for(int i=1;i<=p;i++)
{
r*=b;
}
System.out.println(r);
}
}
