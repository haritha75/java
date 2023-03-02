//write a program given number palindome or not
import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int r,s=0;
 int t=n;
 while(n>0)
 {
 r=n%10;
 n=n/10;
 s=s*10+r;
 }
 if(t==s)
 {
 System.out.println("palindrome");
 }
 else
 {
  System.out.println(" not palindrome");
  }
 }
 }
