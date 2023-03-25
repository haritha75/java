//print every word begin with uppercase
public class First_Letter_Upper1
{
public static void main(String args[])
{
String s1="everyone Have their Own perspective";
int n=s1.length();
boolean flag=true;
for(int i=0;i<n;i++)
{
if(flag==true)
{
if(s1.charAt(i)>=65 &&s1.charAt(i)<=90)
System.out.print(s1.charAt(i));
else
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
