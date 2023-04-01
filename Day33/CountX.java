//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
public class CountX
{
public static void main(String args[])
{
String s1="xxhixx";
int res=countX(s1);
System.out.print(res);
}
static int countX(String s1)
{
int count=0;
if(count==s1.length())
return 0;
if(s1.charAt(count)=='x')
{
count++;
return count+countX(s1.substring(1));
}
return countX(s1.substring(1));
}
}
