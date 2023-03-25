//print the given string palindrome or not
public class Palindrome1
{
public static void main(String args[])
{
String s1="madam";
int n=s1.length();
for(int i=0;i<n/2;i++)
{
if(s1.charAt(i)!=s1.charAt(n-i-1))
{
System.out.print(" not palindrome");
return;
}
}
System.out.print("palindrome");
}
}


