//print the given string in reversee order
public class RevString
{
public static void main(String args[])
{
String s1="Focus Consistency Simple Complicated";
String res="";
int n=s1.length();
for(int i=n-1;i>=0;i--)
{
res+=s1.charAt(i);
}
System.out.print(res);
}
}
