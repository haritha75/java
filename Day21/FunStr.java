//write a program on string functions
import java.util.Arrays;
public class FunStr
{
public static void main(String args[])
{
String s1="Hello Everyone!";
String s=new String("  hello everyone!");
String s2="welcome to the course";
System.out.println(s1.equalsIgnoreCase(s));//it ignore the uppercase and lower case .it check only content.
System.out.println(String.format("string is %s",s1));//it format given string.%s means String .
byte arr[];
arr=s1.getBytes();
System.out.println(Arrays.toString(arr));//it convert characters into byte values.
System.out.println(s1.startsWith("He"));//it check string start with given characters or not.

System.out.println(s.hashCode());//it return code to the given string.

System.out.println(s2.indexOf("t",5));//it searching after given index number and returns the given character index number.

System.out.println(s2.lastIndexOf("u",19));//it return given character index in the last index and check given index number before and then print output.

System.out.println(s.isEmpty());//it return true if given string is empty.otherwise,false return.

 String s3=s1.intern();//s1 string assign to the s3.intern is default.
 
System.out.println(s1==s3);//it check both string address same or not 

System.out.println(s.trim());//it remove the spaces between string left and right.

System.out.println(s1.replace('H','h'));//it replace given character with the original character or string also.

System.out.println(s1.replaceAll("e","a"));// replaces all occurrences of e to a.

System.out.println(s2.replaceFirst("course","world"));//it replace new string to the first String.

System.out.println(s1.toLowerCase());//it return all lower cases
int a=5;
String name="hello";
System.out.println(name+String.valueOf(a));//it converts values into string.
String regex1="^j*a$";//* it check previous letter same or not
String regex="^j..a$";//.. means you can write any letter on that place
String org="java";
String org1="jja";
System.out.println(org.matches(regex));// it check both string if same it return true.
System.out.println(org1.matches(regex1));//it check both string if same it return true.
System.out.println(s1.substring(0,4));// it return substring  of given index and also how many letter you ca mention.
String jn=String.join(">","A","B","C","D");//it means joins the given symbol with each string or character.
System.out.println(jn);
System.out.println(s1.subSequence(3,12));//it print given index to  given index character.
String b[]=s1.split("e");//it means removeing given char and start new line remaining content
for( var c:b)
System.out.println(c);
}
}
