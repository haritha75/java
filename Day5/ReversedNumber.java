//write a program that prompts the user to input  an integer and then outputs the number with the digits reversed.
import java.util.Scanner;
public class ReversedNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r;
while(n>0)
{
r=n%10;
n=n/10;
System.out.print(r);
}
}
}

