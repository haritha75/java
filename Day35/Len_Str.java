//print length of the string using recursion.
public class Len_Str
{
public static void main(String args[])
{
String s1="haritha";
int res=lenStr(s1);
System.out.print(res);
}
static int lenStr(String s1)
{
if(s1.length()==0)
return 0;
return 1+lenStr(s1.substring(1));
}
}
