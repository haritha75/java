//print substring  values
public class SubStrings
{
public static void main(String args[])
{
String s1="hello";
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<s1.length();j++)
{
for(int k=i;k<=j;k++)
System.out.print(s1.charAt(k));
System.out.println();
}
}
}
}
