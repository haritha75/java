//print the largest word means how many letters containning.
public class Max_Word
{
public static void main(String args[])
{
String s1="everyone have their own perspective";
int Max=Integer.MIN_VALUE;
int start=0;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)!=' ')
start++;
if(s1.charAt(i)==' '||i==s1.length()-1)
{
if(start>Max)
Max=start;
start=0;
}
}
System.out.print(Max);
}
}

