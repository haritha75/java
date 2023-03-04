//write a program to enter the number till the user wants and at the end it should display the count of positive,negative and zeros entered.
import java.util.Scanner;
public class PosNegZeros
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int Pos=0;
int Neg=0;
int Zeros=0;
char c;
int n;
do
{
System.out.println("enter the number:");
n=sc.nextInt();
if(n>0)
{
Pos++;
}
else if(n<0)
{
Neg++;
}
else
{
Zeros++;
}
System.out.println("do want to enter the number:");
c=sc.next().charAt(0);
if(c=='n'||c=='N')
break;
}
while(true);
System.out.println(Pos+" "+Neg);

}
}

