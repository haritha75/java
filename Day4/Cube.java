//write a program in java to display the cube of the number upto given an integer.
import java.util.Scanner;
public class Cube
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 int res=0;
 for(int i=1;i<=n;i++)
 {
 res=i*i*i;
 System.out.println(res);
 }
}
}
