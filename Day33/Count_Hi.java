//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

public class Count_Hi
{
public static void main(String args[])
{
String s1="xhixhix";
int res=countHi(s1);
System.out.print(res);
}
static int countHi(String s1)
{
if(s1.length()==1||s1.length()==0)
  return 0;
  if(s1.substring(0,2).equals("hi"))
  return 1+countHi(s1.substring(1));
  return countHi(s1.substring(1));
  }
  }
