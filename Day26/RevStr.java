//print given string reverse form
public class RevStr
{
public static void main(String args[])
{
String s1="Everyone have their own perspective";
int n=s1.length();
for(int i=s1.length()-1;i>=0;i--)
{
if(s1.charAt(i)==' ')
{
for(int j=i+1;j<n;j++)
System.out.print(s1.charAt(j));
System.out.print(" ");
n=i;
}
if(i==0)
{
for(int j=0;j<n;j++)
{
System.out.print(s1.charAt(j));
}
}
}
}
}

