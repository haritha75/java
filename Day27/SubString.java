public class SubString
{
public static void main(String args[])
{
String s1="hello";
String s2="elw";
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)==s2.charAt(0))
{
int k=i+1;
int c=0;
for(int j=1;j<s2.length();j++)
{
if(s2.charAt(j)!=s1.charAt(k))
{
c++;
break;
}
k++;
}
if(c==0)
{
System.out.print("yes");
return;
}
}
}
System.out.print("no");

}
}

