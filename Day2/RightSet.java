//checking whether right most bit is set/not

import java.util.Scanner;
public  class RightSet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int start=1;
if((n&start)==1)
{
System.out.println("set");
}
else
{
System.out.println("not set");
}
}
}
