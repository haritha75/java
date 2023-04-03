//Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

public class StringClean
{
public static void main(String args[])
{
String str="yyzzza";
String res=stringClean(str);
System.out.print(res);
}
static String stringClean(String str)
{
if(str.length()<=1)
return str;
if(str.charAt(0)==str.charAt(1))
return stringClean(str.substring(1));
return str.charAt(0)+stringClean(str.substring(1));
}
}
