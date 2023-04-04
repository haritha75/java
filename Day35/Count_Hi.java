//Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.

public class Count_Hi
{
public static void main(String args[])
{
String str="ahixhi";
int res=countHi(str);
System.out.print(res);
}
static int countHi(String str)
{
if(str.length()<2)
return 0;
if(str.charAt(0)=='x'&&str.charAt(1)=='h')
return countHi(str.substring(2));
else
{
if(str.charAt(0)=='h'&&str.charAt(1)=='i')
return 1+countHi(str.substring(2));
else
return countHi(str.substring(1));
}
}
}
