//write a program on  pass by reference using string.
public class Ex1
{
public static void main(String args[])
{
String s1="hello";
System.out.println(s1);
change(s1);
System.out.println(s1);
System.out.println(s1.hashCode());
}
static void change(String s2)
{
s2="hari";
System.out.println(s2);
System.out.println(s2.hashCode());
}
}
