//wite a do=while loop that asks the user to enter two numbers.the numbers should be added and the sum displayed.the loop should ask the user whether he or she wishes to perform operation again.if so,the loop should repeat,otherwise it should terminate.
import java.util.Scanner;
public class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("enter a number:");
int x=sc.nextInt();
System.out.println("enter a number:");
int y=sc.nextInt();
System.out.println(x+y);
System.out.println("do you want again:");
char c=sc.next().charAt(0);
if(c=='y'||c=='Y')
continue;
else
return;
}
}
}
