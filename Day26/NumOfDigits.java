//count number of digits given string
public class NumOfDigits
{
public static void main(String args[])
{
String s1="ab1cd5f09743";
int count=0;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
count++;
}
System.out.print(count);
}
}
