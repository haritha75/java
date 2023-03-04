//write a program that prompts the user to input a positive integer.it should then print the multiplication table of that number.
import java.util.Scanner;
public class Table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int input=sc.nextInt();
while((input)<1)
{
System.out.println("enter the positive number:");
}
for(int i=1;i<=10;i++)
System.out.println(input+"*"+i+"="+input*i);
}
}
