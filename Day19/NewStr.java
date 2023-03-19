public class NewStr
{
public static void main(String args[])
{
String s1="teju";
String s2="";
for(int i=0;i<s1.length();i++)
{
if(i!=s1.length()-1)
s2+=s1.charAt(i);
else
s2+='a';
System.out.println(s2);
}
System.out.print(s2);
}
}
