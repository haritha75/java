public class Matching
{
public static void main(String args[])
{
String s1="abbc";
String s2="baac";
if(s1.length()!=s2.length())
{
System.out.print("not matching");
return;
}
int x=0,y=0;
for(var u:s1.toCharArray())
{
 x+=u;
 }
 for(var r:s2.toCharArray())
 {
 y+=r;
 }
 if(x==y)
 System.out.print("matching");
 else
 System.out.print("not matching");
 }
 }
 
