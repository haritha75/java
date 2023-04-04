//Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

public class StrCopies
{
public static void main(String args[])
{
String str="catcowcat";
String sub="cat";
int n=2;
boolean res=strCopies(str,sub,n);
System.out.print(res);
}
static boolean strCopies(String str,String sub,int n)
{
int strlen=str.length();
int sublen=sub.length();
if(strlen<sublen)
{
if(n<=0)
return true;
else
return false;
}
if(str.substring(0,sublen).equals(sub))
return strCopies(str.substring(1),sub,n-1);
return strCopies(str.substring(1),sub,n);
}
}


