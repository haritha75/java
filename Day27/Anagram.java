//find given string anagram.
public class Anagram
{
public static void main(String args[])
{
String s1="garm";//listen
String s2="arm";//silent
int c=0,d=0;
if(s1.length()!=s2.length())
{
System.out.print("not anagram");
return;
}
for(int i=0;i<s1.length();i++)
{
int ascill=s1.charAt(i);
c+=ascill;
int asc=s2.charAt(i);
d+=asc;
}
System.out.println(c+" "+d);
if(c==d)
System.out.println("anagram");
else
System.out.println("not anagram");
}
}

