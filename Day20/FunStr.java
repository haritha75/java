//write a code on string functions.
public class FunStr
{
public static void main(String args[])
{
String s1="hello world";//string pool
String s2=new String("hello world");//outside string pool
if(s1!=s2)//it will check address of variable .s1 and s2 not same address because s1 in string pool and s2 will be outside  string pool.
{
System.out.println("yes");
}
if(s1.equals(s2))//it check both  var content same or not.
{
System.out.println("yes");
}
System.out.println(s1.endsWith("world"));//it check given string at the end or not
System.out.println(s1.concat(" world"));//it combines the string
System.out.println(s1.equals("hello"));
System.out.println(s1.contains("ld"));//it check given string contains s1 or not
System.out.println(s1.contentEquals("hello world"));// it check exact string or not given string
System.out.println(s1.compareTo(s2));// it compare two strings with char to char using ascill value.if same it return 0 value.
System.out.println(s2.length());//it returns length of string
System.out.println(s1.charAt(6));//it returns charcter based on the index

}
}
