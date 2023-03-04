//write a program to print out all amstrong numbers between a and 500.
public class Amstrong
{
public static void main(String args[])
{
 for( int i=1;i<=500;i++)
 {
  int r,s=0;
  int n=i;
 while(n>0)
 {
 r=n%10;
  s=s+r*r*r;
 n=n/10;
 }
 if(i==s)
 System.out.println(i);
 
 }
 }
 }
