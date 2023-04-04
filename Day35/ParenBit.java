//Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

public class ParenBit
{
public static void main(String args[])
{
String str="xyz(abc)123";
String res=parenBit(str);
System.out.print(res);
}
static String parenBit(String str)
{
if(str.length()<2)
return "";
if(str.charAt(0)=='(')
{
int len=str.length();
if(str.charAt(len-1)==')')
return str;
else
return parenBit(str.substring(0,len-1));
}
else
{
return parenBit(str.substring(1));
}
}
}
