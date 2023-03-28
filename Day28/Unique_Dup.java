public class Unique_Dup
{
public static void main(String args[])
{
String s1="hello";
int a[]=new int[128];
for(int i=0;i<s1.length();i++)
{
boolean flag=true;
for(int j=0;j<s1.length();j++)
{
if(s1.charAt(i)==s1.charAt(j) &&i!=j)
{
flag =false;
break;
}
}
if(flag)//if(!flag)
System.out.print(s1.charAt(i));
}
}
}

