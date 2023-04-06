//print given string anagram or not
import java.util.Arrays;
public class Anagram
{
public static void main(String args[])
{
String s1="hello";
String s2="olleh";
if(s1.length()!=s2.length())
{
System.out.print("not anagram");
return;
}
char s[]=s1.toCharArray();
char c[]=s2.toCharArray();
Arrays.sort(s);
Arrays.sort(c);
for(int i=0;i<s.length;i++)
{
if(s[i]!=c[i])
System.out.print(" not anagram");
}
System.out.print("anagram");

}
}
