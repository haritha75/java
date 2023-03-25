//print every word begin with uppercase
public class First_Letter_Upper
{
public static void main(String args[])
{
String s1="everyone have their own perspective";
int n=s1.length();
boolean flag=true;
for(int i=0;i<n;i++)
{
if(flag==true)
{
System.out.print((char)(s1.charAt(i)-32));
flag=false;
}
else if(s1.charAt(i)==' ')
{
System.out.print(s1.charAt(i));
flag=true;
}
else
{
System.out.print(s1.charAt(i));
}
}
}
}
