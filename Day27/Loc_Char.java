//find out first string characters at what place located in second string.
public class Loc_Char
{
public static void main(String args[])
{
String s1="listen";
String s2="silent";
String s3;
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<s1.length();j++)
{
if(s1.charAt(i)==s2.charAt(j))
{
System.out.println(j);
break;
}
}
}
}
}
