//print  unique letters
import java.util.Arrays;
public class Duplicate_Or_Unique
{
public static void main(String args[])
{
String s1="rockh";
char s2[]=s1.toCharArray();
Arrays.sort(s2);
for(int i=0;i<s2.length-1;i++)
{
if(s2[i]==s2[i+1])
{
System.out.print("duplicate");
return;
}
}
System.out.print("unique");
}
}
