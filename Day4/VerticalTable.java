//write a program in java to display the multiplication table vertically from 1 to n.
import java.util.Scanner;
public class VerticalTable
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
for(int j=1;j<=n;j++)
{
int x=i*j;
System.out.println(i+"x"+j+"="+x+",");
}
System.out.println("");
}
}
}
