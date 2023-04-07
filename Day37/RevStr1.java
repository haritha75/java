//print given string reverse form
public class RevStr1
{
public static void main(String args[])
{
String s1="Everyone have their own pyerspective";
int n=0;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)==' ')
{
for(int j=i-1;j>=n;j--)
System.out.print(s1.charAt(j));
System.out.print(" ");
n=i;
}
if(i==s1.length()-1)
{
for(int j=s1.length()-1;j>=n;j--)
{
System.out.print(s1.charAt(j));
}
}
}
}
}

