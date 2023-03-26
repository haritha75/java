//print the given string pangram
public class Pangram
{
public static void main(String args[])
{
String s1="abcdfd";
boolean res[]=new boolean[4];
for(int i=0;i<s1.length();i++)
{
int index=s1.charAt(i)-97;
if(index>=0 &&index<res.length)
res[index]=true;
}
for(var x:res)
System.out.print(x+" ");
}
}
