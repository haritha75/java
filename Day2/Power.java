//check whether a given number is power of 2 or not

import java.util.Scanner;
public class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int start=1;
int count=0;
for(int i=0;i<32;i++)
{
if((n&start)!=0)
count++;
start<<=1;
}
if(count==1)
System.out.println("yes");
else
System.out.println("no");
}
}

