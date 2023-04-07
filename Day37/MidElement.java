//reverse a word and print the middle element,if word is even then print middle two elements,if odd print middle element.

public class MidElement
{
public static void main(String args[])
{
String s1="harithai";
for(int i=s1.length()-1;i>=0;i--)
{
System.out.print(s1.charAt(i));
}
System.out.println();
if(s1.length()%2==0)
System.out.println(s1.substring(s1.length()/2-1,s1.length()/2+1));
else
System.out.println(s1.charAt(s1.length()/2));

}
}

