//write a program that prompts the user to input a  positive integer.it should then output a message indicating whether the number is a prime number.
import java.util.Scanner;
public class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
if(n<1)
{
System.out.print("enter positive number:");
}

for(int i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2 || count==1)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}



