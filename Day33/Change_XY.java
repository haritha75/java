//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

public class Change_XY
{
public static void main(String args[])
{
String s1="xxhixx";
String res=changeXY(s1);
System.out.print(res);
}
static String changeXY(String s1)
{
if(s1.length()==0)
return "";
if(s1.charAt(0)=='x')
return "y"+changeXY(s1.substring(1));
return s1.charAt(0)+changeXY(s1.substring(1));
}
}
