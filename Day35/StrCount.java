//Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.

public class StrCount
{
public static void main(String args[])
{
String str="catcowcat";
String sub="cat";
int res=strCount(str,sub);
System.out.print(res);
}
static int strCount(String str,String sub)
{
if(str.length()<sub.length())
return 0;
if(str.substring(0,sub.length()).equals(sub))
return 1+strCount(str.substring(sub.length()),sub);
else
return strCount(str.substring(1),sub);
}
}
