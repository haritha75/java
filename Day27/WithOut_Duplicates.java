//print  unique letters if have duplicate you can make unique letters
public class WithOut_Duplicates
{
public static void main(String args[])
{
String s1="hellorock";
String s2=" ";
for(int i=0;i<s1.length();i++)
{
int c=0;
for(int j=0;j<s1.length();j++)
{
if(s1.charAt(i)==s1.charAt(j))
{
c++;
}
}
if(c>1)
{//ollo
 s2+=s1.charAt(i);//lloo
//System.out.print(s2.charAt(i));
}
}
int s=0;
for(int i=1;i<s2.length();i++)
{
if(s2.charAt(s)!=s2.charAt(i))
{
System.out.print(s2.charAt(i));
}
s++;
}
}
}

