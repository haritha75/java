//Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
public class Change_Pi
{
public static void main(String args[])
{
String str="xpix";
String res=changePi(str);
System.out.print(res);
}
static String changePi(String str)
{
if(str.length()==0)
return "";
if(str.length()==1)
return str;
if(str.substring(0,2).equals("pi"))
return "3.14"+changePi(str.substring(2));
return str.charAt(0)+changePi(str.substring(1));
}
}
