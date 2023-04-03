//Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

public class End_X
{
public static void main(String args[])
{
String str="xxre";
String res=endX(str);
System.out.println(res);
}
static String endX(String str)
{
if(str.length()==0||str.length()==1)
  return str;
  if(str.charAt(0)!='x')
   return str.charAt(0)+endX(str.substring(1));
      return endX(str.substring(1))+"x";
      }
      }

