//write a program on palindrome using recursion
public class Palindrome
{
public static void main(String args[])
{
String s1="madlm";//madam,mom,j,""
System.out.print(Palim(s1));

}
static boolean Palim(String s1)
{
int len=s1.length();
if(len==0||len==1)//base condition.Here, if length 1 then it's palindrome and length 0 also palindrome.so return true.
return true;
if(s1.charAt(0)!=s1.charAt(len-1))
return false;
return Palim(s1.substring(1,len-1));
}
}
