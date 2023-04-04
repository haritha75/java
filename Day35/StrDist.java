//Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
public class StrDist
{
public static void main(String args[])
{
String str="cccatcowcatxx";
String sub="cat";
int res=strDist(str,sub);
System.out.print(res);
}
static int strDist(String str,String sub)
{
int strlen=str.length();
int sublen=sub.length();
if(strlen<sublen)
return 0;
if(str.substring(0,sublen).equals(sub))
{
if(str.substring(strlen-sublen).equals(sub))
return str.length();
else
return strDist(str.substring(0,strlen-1),sub);
}
return strDist(str.substring(1),sub);
}
}


