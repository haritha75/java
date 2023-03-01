//count of set bits in a given number

import java.util.Scanner;
public class CountSet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int start=1;
int count=0;
for(int i=0;i<20;i++)
{
if((n&start)!=0)
count++;
start<<=1;
}
System.out.println("number of counts:"+count);
}
}

