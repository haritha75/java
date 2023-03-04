//write a program to enter the numbers till the user wants ad at the end it should dispaly the largest and smallest numbers entered.
import java.util.Scanner;
public class LAndS
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int Max=Integer.MIN_VALUE;
int Min=Integer.MAX_VALUE;
char c;
int n;
do
{
System.out.println("enter the number:");
n=sc.nextInt();
if(n>Max)
Max=n;
if(n<Min)
Min=n;
System.out.println("do want to enter the number:");
c=sc.next().charAt(0);
if(c=='n'||c=='N')
break;
}
while(true);
System.out.println(Max+" "+Min);

}
}

