//print the given string palindrome or not
public class Palindrome
{
public static void main(String args[])
{
String s1="abba";
String res="";
for(int i=0;i<s1.length();i++)
{
res+=s1.charAt(s1.length()-i-1);
}
if(res.equals(s1))
System.out.print("palindrome");
else
System.out.print("not palindrome");
}
}

