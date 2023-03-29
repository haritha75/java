//print given string matching or not.
public class Matching
{
public static void main(String args[])
{
String str="(){})";
int open=0;
int close=0;
int mismatch=0;
for(int i=0;i<str.length();i++)
{
char s1=str.charAt(i);
if(s1=='(')
{
open++;
}
else if(s1==')')
{
if(open>0)
{
open--;
close++;
}
else
{
mismatch++;
close++;
}
}
if(s1=='{')
{
open++;
}
else if(s1=='}')
{
if(open>0)
{
open--;
close++;
}
else
{
mismatch++;
close++;
}
}
}
System.out.println(open+" "+close+" "+mismatch);
if(open==0&&mismatch==0)
System.out.println("matching");
else
System.out.println("mismatching");
}
}
